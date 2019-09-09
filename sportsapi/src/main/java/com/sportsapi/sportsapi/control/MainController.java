package com.sportsapi.sportsapi.control;

import com.sportsapi.sportsapi.entity.Country;
import com.sportsapi.sportsapi.entity.League;
import com.sportsapi.sportsapi.entity.Team;
import com.sportsapi.sportsapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(path="/")
public class MainController {

    @Autowired
    MainService mainService;

    @Autowired
    CountryRepository countryRepository;

    @GetMapping(path="/countries")
    public String getCountries(Model model) {

        List<Country> countries = mainService.getCountries();
        model.addAttribute("countries", countries);

        return "countries";
    }

    @GetMapping(path="/leagues")
    public String getLeagues(Model model) {

        List<League> leagues = mainService.getLeagues();
        model.addAttribute("leagues", leagues);
        return "leagues";
    }

    @GetMapping(path="/teams")
    public String getTeams(Model model) {

        List<Team> teams = mainService.getTeams();
        model.addAttribute("teams", teams);

        return "teams";
    }

    @GetMapping(path="/fetch/countries")
    public String fetchCountries() {

        mainService.fetchData(DataFetchType.COUNTRIES,"");

        return "success";
    }

    @GetMapping(path="/fetch/leagues")
    public String fetchLeagues() {

        mainService.fetchData(DataFetchType.LEAGUES,"");

        return "success";
    }


    @GetMapping(path="/fetch/teams/{leagueid}")
    public String fetchTeamsByLeague(@PathVariable("leagueid") String leagueid) {

        mainService.fetchData(DataFetchType.TEAMS, leagueid);

        return "success";
    }

    @GetMapping(path="/fetch/statistics/{teamid}")
    public String fetchTeamStatisticsByTeam(@PathVariable("teamid") String teamid) {

        mainService.fetchData(DataFetchType.TEAMSTATISTICS, teamid);

        return "success";
    }



}
