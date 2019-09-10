package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.*;
import java.util.List;

@Entity(name="team")
public class Team {

    @Id
    private Integer teamId;
    private String name;
    private String code;
    private String logo;
    @ManyToOne
    @JoinColumn(name="league_id")
    private League league;
    private Integer founded;
    private String venueName;
    private String venueAddress;
    private String venueCity;
    private Integer venueCapacity;
    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Team() {
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueCity() {
        return venueCity;
    }

    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    public Integer getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(Integer venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", logo='" + logo + '\'' +
                ", founded=" + founded +
                ", venueName='" + venueName + '\'' +
                ", venueAddress='" + venueAddress + '\'' +
                ", venueCity='" + venueCity + '\'' +
                ", venueCapacity=" + venueCapacity +
                '}';
    }

    public static Team getTeamFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            Team team = new Team();
            team.setTeamId(!jsonObject.get("team_id").equals(null) ? (Integer)jsonObject.get("team_id") : null);
            team.setName(!jsonObject.get("name").equals(null) ? (String)jsonObject.get("name") : null);
            team.setCode(!jsonObject.get("code").equals(null) ? (String)jsonObject.get("code") : null);
            team.setLogo(!jsonObject.get("logo").equals(null) ? (String)jsonObject.get("logo") : null);
            team.setFounded(!jsonObject.get("founded").equals(null) ? (Integer)jsonObject.get("founded") : null);
            team.setVenueName(!jsonObject.get("venue_name").equals(null) ? (String)jsonObject.get("venue_name") : null);
            team.setVenueAddress (!jsonObject.get("venue_address").equals(null) ? (String)jsonObject.get("venue_address") : null);
            team.setVenueCity(!jsonObject.get("venue_city").equals(null) ? (String)jsonObject.get("venue_city") : null);
            team.setVenueCapacity(!jsonObject.get("venue_capacity").equals(null) ? (Integer)jsonObject.get("venue_capacity") : null);

            return team;
        }
        return null;
    }
}
