package com.sportsapi.sportsapi.control;

import com.sportsapi.sportsapi.entity.Country;
import com.sportsapi.sportsapi.entity.League;
import com.sportsapi.sportsapi.entity.Team;
import com.sportsapi.sportsapi.repository.CountryRepository;
import com.sportsapi.sportsapi.repository.LeagueRepository;
import com.sportsapi.sportsapi.repository.TeamsRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class MainService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamsRepository teamsRepository;

    private static Logger logger = Logger.getLogger(MainService.class.getCanonicalName());

    public void fetchData(DataFetchType dataFetchType, String param) {

        JSONObject jsonObject = prepareJSONObject(dataFetchType, param);
        JSONArray jsonArray = jsonObject.getJSONObject("api").getJSONArray(dataFetchType.getFetchType());

        for (Object arrayObject : jsonArray) {
            JSONObject entityObject = (JSONObject)arrayObject;

            switch(dataFetchType) {

                case COUNTRIES:
                    Country country = Country.getCountryFromJsonObject(entityObject);
                    countryRepository.save(country);
                    logger.log(Level.INFO,"Country " + country.getCountry() + " saved");
                    break;

                case LEAGUES:
                    League league = League.getLeagueFromJsonObject(entityObject);
                    Country leagueCountry = countryRepository.findCountryByCountryEquals(league.getCountry().getCountry());

                    if (leagueCountry != null) {
                        league.setCountry(leagueCountry);
                    } else {
                        countryRepository.save(league.getCountry());
                    }

                    leagueRepository.save(league);
                    logger.log(Level.INFO,league.toString() + " saved");
                    break;

                case TEAMS:
                    League teamLeague = leagueRepository.findById(Integer.parseInt(param)).get();
                    Team team = Team.getTeamFromJsonObject(entityObject);

                    if (teamLeague != null) {
                        team.setLeague(teamLeague);
                    }

                    teamsRepository.save(team);
                    logger.log(Level.INFO,team.toString() + " saved");

                    break;
            }

        }

        logger.log(Level.INFO,"Fetch of data *" + dataFetchType.getFetchType() + "* finished");

    }


    private JSONObject prepareJSONObject (DataFetchType dataFetchType, String param) {
        String url = Configuration.properties.get(Configuration.RAPID_API_URL_PREFIX) + dataFetchType.getFetchType() + dataFetchType.getUrlSuffix() + param;

        StringBuilder strb = new StringBuilder();

        try {
            URL objUrl = new URL(url);
            HttpURLConnection con = (HttpURLConnection) objUrl.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty(Configuration.RAPID_API_HOST, Configuration.properties.get(Configuration.RAPID_API_HOST));
            con.setRequestProperty(Configuration.RAPID_API_KEY, Configuration.properties.get(Configuration.RAPID_API_KEY));

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
            logger.log(Level.SEVERE,"Could not fetch data, " + e.getMessage());
            return null;
        }
    }




}

