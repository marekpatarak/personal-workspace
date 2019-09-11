package com.sportsapi.sportsapi.control;

import com.sportsapi.sportsapi.entity.Country;
import com.sportsapi.sportsapi.entity.League;
import com.sportsapi.sportsapi.entity.Player;
import com.sportsapi.sportsapi.entity.Team;
import com.sportsapi.sportsapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ViewService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamsRepository teamsRepository;

    @Autowired
    private TeamStatisticsRepository teamStatisticsRepository;

    @Autowired
    private PlayerRepository playersRepository;

    private static Logger logger = Logger.getLogger(ViewService.class.getCanonicalName());

    public List<Country> getCountries() {

        return (List<Country>)countryRepository.findAll();
    }

    public List<League> getLeagues() {

        return (List<League>)leagueRepository.findAll();
    }

    public List<Team> getTeams() {

        return (List<Team>)teamsRepository.findAll();
    }


    public List<Player> getPlayers() {

        return (List<Player>)playersRepository.findAll();
    }

    public Map<String,Country> getCountryMap(List<Player> players) {
        Map<String, Country> countryMap = new HashMap<>();

        for(Player player : players) {
            if(countryMap.get(player.getNationality()) == null) {
                Country countryNationality = countryRepository.findCountryByCountryNameEquals(player.getNationality());
                if (countryNationality != null) {
                    countryMap.put(countryNationality.getCountryName(), countryNationality);
                }
            }

            if(countryMap.get(player.getBirthCountry()) == null) {
                Country countryBirth = countryRepository.findCountryByCountryNameEquals(player.getBirthCountry());
                if (countryBirth != null) {
                    countryMap.put(countryBirth.getCountryName(), countryBirth);
                }
            }

        }

        return countryMap;

    }

    public List<Team> getTeamsByLeague(String leagueId) {
        return teamsRepository.findTeamsByLeague_LeagueId(Integer.parseInt(leagueId));
    }

    public List<Player> getPlayersByTeam(String teamId) {
        return playersRepository.findPlayersByTeam_TeamId(Integer.parseInt(teamId));
    }
}

