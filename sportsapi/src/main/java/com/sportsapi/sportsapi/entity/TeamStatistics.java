package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="teamstatistics")
public class TeamStatistics {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer winsHome;
    private Integer winsAway;
    private Integer drawsHome;
    private Integer drawsAway;
    private Integer losesHome;
    private Integer losesAway;
    private Integer goalsForHome;
    private Integer goalsForAway;
    private Integer goalsAgainstHome;
    private Integer goalsAgainstAway;
    @OneToOne (mappedBy = "team_statistics")
    private Team team;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWinsHome() {
        return winsHome;
    }

    public void setWinsHome(Integer winsHome) {
        this.winsHome = winsHome;
    }

    public Integer getWinsAway() {
        return winsAway;
    }

    public void setWinsAway(Integer winsAway) {
        this.winsAway = winsAway;
    }

    public Integer getDrawsHome() {
        return drawsHome;
    }

    public void setDrawsHome(Integer drawsHome) {
        this.drawsHome = drawsHome;
    }

    public Integer getDrawsAway() {
        return drawsAway;
    }

    public void setDrawsAway(Integer drawsAway) {
        this.drawsAway = drawsAway;
    }

    public Integer getLosesHome() {
        return losesHome;
    }

    public void setLosesHome(Integer losesHome) {
        this.losesHome = losesHome;
    }

    public Integer getLosesAway() {
        return losesAway;
    }

    public void setLosesAway(Integer losesAway) {
        this.losesAway = losesAway;
    }

    public Integer getGoalsForHome() {
        return goalsForHome;
    }

    public void setGoalsForHome(Integer goalsForHome) {
        this.goalsForHome = goalsForHome;
    }

    public Integer getGoalsForAway() {
        return goalsForAway;
    }

    public void setGoalsForAway(Integer goalsForAway) {
        this.goalsForAway = goalsForAway;
    }

    public Integer getGoalsAgainstHome() {
        return goalsAgainstHome;
    }

    public void setGoalsAgainstHome(Integer goalsAgainstHome) {
        this.goalsAgainstHome = goalsAgainstHome;
    }

    public Integer getGoalsAgainstAway() {
        return goalsAgainstAway;
    }

    public void setGoalsAgainstAway(Integer goalsAgainstAway) {
        this.goalsAgainstAway = goalsAgainstAway;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "TeamStatistics{" +
                "id=" + id +
                ", winsHome=" + winsHome +
                ", winsAway=" + winsAway +
                ", drawsHome=" + drawsHome +
                ", drawsAway=" + drawsAway +
                ", losesHome=" + losesHome +
                ", losesAway=" + losesAway +
                ", goalsForHome=" + goalsForHome +
                ", goalsForAway=" + goalsForAway +
                ", goalsAgainstHome=" + goalsAgainstHome +
                ", goalsAgainstAway=" + goalsAgainstAway +
                ", team=" + team.getTeam_id() +
                '}';
    }

    public static TeamStatistics getTeamStatisticsFromJsonObject(JSONObject jsonObject) {
        JSONObject matchs = jsonObject.getJSONObject("matchs");
        JSONObject goals = jsonObject.getJSONObject("goals");
        TeamStatistics teamStatistics = new TeamStatistics();
        if (matchs != null) {
            Integer winsHome = (Integer) matchs.getJSONObject("wins").get("home");
            teamStatistics.setWinsHome(winsHome);
            Integer winsAway = (Integer) matchs.getJSONObject("wins").get("away");
            teamStatistics.setWinsAway(winsAway);
            Integer drawsHome = (Integer) matchs.getJSONObject("draws").get("home");
            teamStatistics.setDrawsHome(drawsHome);
            Integer drawsAway = (Integer) matchs.getJSONObject("draws").get("away");
            teamStatistics.setDrawsAway(drawsAway);
            Integer losesHome = (Integer) matchs.getJSONObject("loses").get("home");
            teamStatistics.setLosesHome(losesHome);
            Integer losesAway = (Integer) matchs.getJSONObject("loses").get("away");
            teamStatistics.setLosesAway(losesAway);
        }

        if (goals != null) {
            Integer goalsForHome = (Integer) goals.getJSONObject("goalsFor").get("home");
            teamStatistics.setGoalsForHome(goalsForHome);
            Integer goalsForAway = (Integer) goals.getJSONObject("goalsFor").get("away");
            teamStatistics.setGoalsForAway(goalsForAway);
            Integer goalsAgainstHome = (Integer) goals.getJSONObject("goalsAgainst").get("home");
            teamStatistics.setGoalsAgainstHome(goalsAgainstHome);
            Integer goalsAgainstAway = (Integer) goals.getJSONObject("goalsAgainst").get("away");
            teamStatistics.setGoalsAgainstAway(goalsAgainstAway);
        }

        return teamStatistics;
    }


}
