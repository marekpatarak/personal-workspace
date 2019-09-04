package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.*;
import java.util.List;

@Entity(name="league")
public class League {

    @Id
    private Integer league_id;
    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
    private Integer season;
    private String season_start;
    private String season_end;
    private String logo;
    private Boolean standings;
    private Boolean is_current;
    @OneToMany(mappedBy = "league")
    private List<Team> teams;

    public League(Integer league_id, String name, Integer season, String season_start, String season_end, String logo, Boolean standings, Boolean is_current) {
        this.league_id = league_id;
        this.name = name;
        this.season = season;
        this.season_start = season_start;
        this.season_end = season_end;
        this.logo = logo;
        this.standings = standings;
        this.is_current = is_current;
    }

    public League() {

    }
    public Integer getLeague_id() {
        return league_id;
    }

    public void setLeague_id(Integer league_id) {
        this.league_id = league_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getSeason_start() {
        return season_start;
    }

    public void setSeason_start(String season_start) {
        this.season_start = season_start;
    }

    public String getSeason_end() {
        return season_end;
    }

    public void setSeason_end(String season_end) {
        this.season_end = season_end;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getStandings() {
        return standings;
    }

    public void setStandings(Boolean standings) {
        this.standings = standings;
    }

    public Boolean getIs_current() {
        return is_current;
    }

    public void setIs_current(Boolean is_current) {
        this.is_current = is_current;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "League{" +
                "league_id=" + league_id +
                ", name='" + name + '\'' +
                ", country=" + country.getCountry() +
                ", season=" + season +
                ", season_start='" + season_start + '\'' +
                ", season_end='" + season_end + '\'' +
                ", logo='" + logo + '\'' +
                ", standings=" + standings +
                ", is_current=" + is_current +
                '}';
    }

    public static League getLeagueFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            Integer leagueId = !jsonObject.get("league_id").equals(null) ? (Integer)jsonObject.get("league_id") : null;
            String name = !jsonObject.get("name").equals(null) ? (String)jsonObject.get("name") : null;
            Integer season = !jsonObject.get("season").equals(null) ? (Integer)jsonObject.get("season") : null;
            String seasonStart = !jsonObject.get("season_start").equals(null) ? (String)jsonObject.get("season_start") : null;
            String seasonEnd = !jsonObject.get("season_end").equals(null) ? (String)jsonObject.get("season_end") : null;
            String logo = !jsonObject.get("logo").equals(null) ? (String)jsonObject.get("logo") : null;
            Boolean standings = (Integer) jsonObject.get("standings") == 1 ? true : false;
            Boolean isCurrent = (Integer) jsonObject.get("is_current") == 1 ? true : false;

            String countryName = !jsonObject.get("country").equals(null) ? (String)jsonObject.get("country") : null;
            String countryCode = !jsonObject.get("country_code").equals(null) ? (String)jsonObject.get("country_code") : null;

            Country country = new Country(countryName,countryCode,null);
            League league = new League(leagueId,name,season,seasonStart,seasonEnd,logo,standings,isCurrent);
            league.setCountry(country);

            return league;
        }
        return null;
    }
}
