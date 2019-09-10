package com.sportsapi.sportsapi.control;

import com.sportsapi.sportsapi.entity.Country;
import com.sportsapi.sportsapi.entity.League;
import com.sportsapi.sportsapi.entity.Player;
import com.sportsapi.sportsapi.entity.Team;
import com.sportsapi.sportsapi.repository.CountryRepository;
import com.sportsapi.sportsapi.repository.LeagueRepository;
import com.sportsapi.sportsapi.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(path="/")
public class ViewController {

    @Autowired
    ViewService viewService;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    TeamsRepository teamsRepository;
    @Autowired
    LeagueRepository leagueRepository;

    @GetMapping(path="/test")
    public String test() {

        Team team = (Team)teamsRepository.findById(33).get();
        League leagues1 = (League)leagueRepository.findById(524).get();
        League leagues2 = (League)leagueRepository.findById(524).get();

        String sa = null;

        return "success";
    }


    @GetMapping(path="/countries")
    public String getCountries(Model model) {

        List<Country> countries = viewService.getCountries();
        model.addAttribute("countries", countries);

        return "countries";
    }

    @GetMapping(path="/leagues")
    public String getLeagues(Model model) {

        List<League> leagues = viewService.getLeagues();
        model.addAttribute("leagues", leagues);
        return "leagues";
    }

    @GetMapping(path="/teams")
    public String getTeams(Model model) {

        List<Team> teams = viewService.getTeams();
        model.addAttribute("teams", teams);

        return "teams";
    }

    @GetMapping(path="/players")
    public String getPlayers(Model model) {

        List<Player> players = viewService.getPlayers();
        Map<String,Country> countryMap = viewService.getCountryMap(players);
        model.addAttribute("players", players);
        model.addAttribute("countryMap", countryMap);

        return "players";
    }





}
