package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.*;
import java.util.List;

@Entity(name="league")
public class League {

    // Premier league id = 524
    // Primera division id = 775
    // Serie A id = 891
    // Bundesliga id = 754
    // Ligue 1 id = 525

    @Id
    private Integer leagueId;
    private String name;
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
    private Integer season;
    private String seasonStart;
    private String seasonEnd;
    private String logo;
    private Boolean standings;
    private Boolean isCurrent;
    @OneToMany(mappedBy = "league")
    private List<Team> teams;

    public League() {

    }
    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
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

    public String getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(String seasonStart) {
        this.seasonStart = seasonStart;
    }

    public String getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(String seasonEnd) {
        this.seasonEnd = seasonEnd;
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

    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
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
                "leagueId=" + leagueId +
                ", name='" + name + '\'' +
                ", country=" + country.getCountryName() +
                ", season=" + season +
                ", seasonStart='" + seasonStart + '\'' +
                ", seasonEnd='" + seasonEnd + '\'' +
                ", logo='" + logo + '\'' +
                ", standings=" + standings +
                ", isCurrent=" + isCurrent +
                '}';
    }

    public static League getLeagueFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            Country country = new Country();
            country.setCountryName(!jsonObject.get("country").equals(null) ? (String)jsonObject.get("country") : null);
            country.setCode(!jsonObject.get("country_code").equals(null) ? (String)jsonObject.get("country_code") : null);

            League league = new League();
            league.setLeagueId(!jsonObject.get("league_id").equals(null) ? (Integer)jsonObject.get("league_id") : null);
            league.setName(jsonObject.get("name").equals(null) ? (String)jsonObject.get("name") : null);
            league.setSeason(!jsonObject.get("season").equals(null) ? (Integer)jsonObject.get("season") : null);
            league.setSeasonStart(!jsonObject.get("season_start").equals(null) ? (String)jsonObject.get("season_start") : null);
            league.setSeasonEnd(!jsonObject.get("season_end").equals(null) ? (String)jsonObject.get("season_end") : null);
            league.setLogo(!jsonObject.get("logo").equals(null) ? (String)jsonObject.get("logo") : null);
            league.setStandings((Integer) jsonObject.get("standings") == 1 ? true : false);
            league.setIsCurrent((Integer) jsonObject.get("is_current") == 1 ? true : false);
            league.setCountry(country);

            return league;
        }
        return null;
    }
}
