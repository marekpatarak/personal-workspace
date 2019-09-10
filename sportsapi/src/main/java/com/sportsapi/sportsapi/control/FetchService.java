package com.sportsapi.sportsapi.control;

import com.sportsapi.sportsapi.entity.Country;
import com.sportsapi.sportsapi.entity.League;
import com.sportsapi.sportsapi.entity.Player;
import com.sportsapi.sportsapi.entity.Team;
import com.sportsapi.sportsapi.repository.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class FetchService {

    @Autowired
    private Config config;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamsRepository teamsRepository;

    @Autowired
    private TeamStatisticsRepository teamStatisticsRepository;

    @Autowired
    private PlayerRepository playerRepository;

    private static Logger logger = Logger.getLogger(FetchService.class.getCanonicalName());

    public void fetchData(DataFetchType dataFetchType, String param) {

        JSONObject jsonObject = fetchJSONObject(dataFetchType, param);

        JSONArray jsonArray = jsonObject.getJSONObject("api").getJSONArray(dataFetchType.getFetchType());

        for (Object arrayObject : jsonArray) {
            JSONObject entityObject = (JSONObject) arrayObject;

            switch (dataFetchType) {

                case COUNTRIES:
                    Country country = Country.getCountryFromJsonObject(entityObject);
                    countryRepository.save(country);
                    logger.log(Level.INFO, "Country " + country.getCountryName() + " saved");
                    break;

                case LEAGUES:
                    League league = League.getLeagueFromJsonObject(entityObject);
                    Country leagueCountry = countryRepository.findCountryByCountryNameEquals(league.getCountry().getCountryName());

                    if (leagueCountry != null) {
                        league.setCountry(leagueCountry);
                    } else {
                        countryRepository.save(league.getCountry());
                    }

                    leagueRepository.save(league);
                    logger.log(Level.INFO, league.toString() + " saved");
                    break;

                case TEAMS:
                    Team team = Team.getTeamFromJsonObject(entityObject);
                    League teamLeague = leagueRepository.findById(Integer.parseInt(param)).get();

                    if (teamLeague != null) {
                        team.setLeague(teamLeague);
                    } else {
                        leagueRepository.save(teamLeague);
                    }

                    teamsRepository.save(team);
                    logger.log(Level.INFO, team.toString() + " saved");

                    break;

                case PLAYERS:
                    Team playerTeam = teamsRepository.findById(Integer.parseInt(param)).get();
                    Player player = Player.getPlayerFromJsonObject(entityObject);

                    if (playerTeam != null) {
                        player.setTeam(playerTeam);
                    }

                    playerRepository.save(player);
                    break;

                case TEAMSTATISTICS:
                    break;

            }

        }

        logger.log(Level.INFO,"Fetch of data *" + dataFetchType.getFetchType() + "* finished");

    }

    private String prepareUrl(DataFetchType dataFetchType, String param) {

        String url = config.getProperty(Config.RAPID_API_URL_PREFIX) + dataFetchType.getFetchType();

        switch(dataFetchType) {
            case COUNTRIES:
                break;
            case LEAGUES:
            case TEAMS:
                url += dataFetchType.getUrlSuffix() + param;
                break;
            case PLAYERS:
                url += dataFetchType.getUrlSuffix() + param + "/" + config.getProperty(Config.SEASON_2019);
                break;
            case TEAMSTATISTICS:
                Team team = teamsRepository.findById(Integer.parseInt(param)).get();
                if (team != null) {
                    Integer leagueId = team.getLeague().getLeagueId();
                    url += dataFetchType.getUrlSuffix() + leagueId + "/" + param;
                } else {
                    return null;
                }

        }

        return url;
    }

    private JSONObject fetchJSONObject(DataFetchType dataFetchType, String param) {
        String url = prepareUrl(dataFetchType, param);
        StringBuilder strb = new StringBuilder();

        try {
            URL objUrl = new URL(url);
            HttpURLConnection con = (HttpURLConnection) objUrl.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty(Config.RAPID_API_HOST, config.getProperty(Config.RAPID_API_HOST));
            con.setRequestProperty(Config.RAPID_API_KEY, config.getProperty(Config.RAPID_API_KEY));

            if(con.getResponseCode() == 200) {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String s = "";
                while ((s = buffer.readLine()) != null) {
                    strb.append(s);
                }

                return new JSONObject(strb.toString());

            } else {
                throw new IOException("Response code not 200");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE,"Could not fetch JSON Object, " + e.getMessage());
            return null;
        }
    }
}
