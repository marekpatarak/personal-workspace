package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.*;

@Entity(name="team")
public class Team {

    @Id
    private Integer team_id;
    private String name;
    private String code;
    private String logo;
    @ManyToOne
    @JoinColumn(name="league_id")
    private League league;
    private Integer founded;
    private String venue_name;
    private String venue_address;
    private String venue_city;
    private Integer venue_capacity;
    @OneToOne
    @JoinColumn(name="teamstatistics_id")
    private TeamStatistics team_statistics;

    public Team() {
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Integer getFounded() {
        return founded;
    }

    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    public String getVenue_name() {
        return venue_name;
    }

    public void setVenue_name(String venue_name) {
        this.venue_name = venue_name;
    }

    public String getVenue_address() {
        return venue_address;
    }

    public void setVenue_address(String venue_address) {
        this.venue_address = venue_address;
    }

    public String getVenue_city() {
        return venue_city;
    }

    public void setVenue_city(String venue_city) {
        this.venue_city = venue_city;
    }

    public Integer getVenue_capacity() {
        return venue_capacity;
    }

    public void setVenue_capacity(Integer venue_capacity) {
        this.venue_capacity = venue_capacity;
    }

    public TeamStatistics getTeam_statistics() {
        return team_statistics;
    }

    public void setTeam_statistics(TeamStatistics team_statistics) {
        this.team_statistics = team_statistics;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team_id=" + team_id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", logo='" + logo + '\'' +
                ", founded=" + founded +
                ", venue_name='" + venue_name + '\'' +
                ", venue_address='" + venue_address + '\'' +
                ", venue_city='" + venue_city + '\'' +
                ", venue_capacity=" + venue_capacity +
                '}';
    }

    public Team(Integer team_id, String name, String code, String logo, Integer founded, String venue_name, String venue_address, String venue_city, Integer venue_capacity) {
        this.team_id = team_id;
        this.name = name;
        this.code = code;
        this.logo = logo;
        this.founded = founded;
        this.venue_name = venue_name;
        this.venue_address = venue_address;
        this.venue_city = venue_city;
        this.venue_capacity = venue_capacity;
    }

    public static Team getTeamFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            Integer teamId = !jsonObject.get("team_id").equals(null) ? (Integer)jsonObject.get("team_id") : null;
            String name = !jsonObject.get("name").equals(null) ? (String)jsonObject.get("name") : null;
            String code = !jsonObject.get("code").equals(null) ? (String)jsonObject.get("code") : null;
            String logo = !jsonObject.get("logo").equals(null) ? (String)jsonObject.get("logo") : null;
            Integer founded = !jsonObject.get("founded").equals(null) ? (Integer)jsonObject.get("founded") : null;
            String venueName = !jsonObject.get("venue_name").equals(null) ? (String)jsonObject.get("venue_name") : null;
            String venueAddress = !jsonObject.get("venue_address").equals(null) ? (String)jsonObject.get("venue_address") : null;
            String venueCity = !jsonObject.get("venue_city").equals(null) ? (String)jsonObject.get("venue_city") : null;
            Integer venueCapacity = !jsonObject.get("venue_capacity").equals(null) ? (Integer)jsonObject.get("venue_capacity") : null;

            Team team = new Team(teamId,name,code,logo,founded,venueName,venueAddress,venueCity,venueCapacity);
            return team;
        }
        return null;
    }
}
