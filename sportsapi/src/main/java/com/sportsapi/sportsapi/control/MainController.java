package com.sportsapi.sportsapi.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="/")
public class MainController {

    @Autowired
    MainService mainService;


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

        String id = leagueid;
        mainService.fetchData(DataFetchType.TEAMS, leagueid);

        return "success";
    }



}
