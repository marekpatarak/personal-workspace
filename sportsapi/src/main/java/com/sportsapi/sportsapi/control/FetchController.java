package com.sportsapi.sportsapi.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/fetch")
public class FetchController {

    @Autowired
    FetchService fetchService;


    @GetMapping(path="/test")
    public String fetchTest() {

        return "success";
    }

    @GetMapping(path="/countries")
    public String fetchCountries() {

        fetchService.fetchData(DataFetchType.COUNTRIES,"");

        return "success";
    }

    @GetMapping(path="/leagues/{leagueId}")
    public String fetchLeague(@PathVariable("leagueId") String leagueId) {

        fetchService.fetchData(DataFetchType.LEAGUES, leagueId);

        return "success";
    }


    @GetMapping(path="/teams/{leagueId}")
    public String fetchTeamsByLeague(@PathVariable("leagueId") String leagueId) {

        fetchService.fetchData(DataFetchType.TEAMS, leagueId);

        return "success";
    }

    @GetMapping(path="/players/{teamid}")
    public String fetchPlayersByTeam(@PathVariable("teamid") String teamId) {

        fetchService.fetchData(DataFetchType.PLAYERS, teamId);

        return "success";
    }

    @GetMapping(path="/statistics/{teamid}")
    public String fetchTeamStatisticsByTeam(@PathVariable("teamid") String teamid) {

        fetchService.fetchData(DataFetchType.TEAMSTATISTICS, teamid);

        return "success";
    }
}
