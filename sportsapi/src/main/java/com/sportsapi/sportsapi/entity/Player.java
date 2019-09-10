package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.*;

@Entity(name="player")
public class Player {

    @Id
    private Integer playerId;
    private String firstName;
    private String lastName;
    private Integer number;
    private String position;
    private Integer age;
    private String birthDate;
    private String birthPlace;
    private String birthCountry;
    private String nationality;
    private String height;
    private String weight;
    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    public Player() {

    }
    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthCountry='" + birthCountry + '\'' +
                ", nationality='" + nationality + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", team=" + team +
                '}';
    }

    public static Player getPlayerFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            Player player = new Player();
            player.setPlayerId(!jsonObject.get("player_id").equals(null) ? (Integer)jsonObject.get("player_id") : null);
            player.setFirstName(!jsonObject.get("firstname").equals(null) ? (String)jsonObject.get("firstname") : null);
            player.setLastName(!jsonObject.get("lastname").equals(null) ? (String)jsonObject.get("lastname") : null);
            player.setNumber(!jsonObject.get("number").equals(null) ? (Integer)jsonObject.get("number") : null);
            player.setPosition(!jsonObject.get("position").equals(null) ? (String)jsonObject.get("position") : null);
            player.setAge(!jsonObject.get("age").equals(null) ? (Integer)jsonObject.get("age") : null);
            player.setBirthDate(!jsonObject.get("birth_date").equals(null) ? (String)jsonObject.get("birth_date") : null);
            player.setBirthPlace(!jsonObject.get("birth_place").equals(null) ? (String)jsonObject.get("birth_place") : null);
            player.setBirthCountry(!jsonObject.get("birth_country").equals(null) ? (String)jsonObject.get("birth_country") : null);
            player.setNationality(!jsonObject.get("nationality").equals(null) ? (String)jsonObject.get("nationality") : null);
            player.setHeight(!jsonObject.get("height").equals(null) ? (String)jsonObject.get("height") : null);
            player.setWeight(!jsonObject.get("weight").equals(null) ? (String)jsonObject.get("weight") : null);

            return player;
        }
        return null;
    }

}
