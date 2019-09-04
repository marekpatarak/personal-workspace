package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Entity(name="country")
public class Country {

    @Id
    @GeneratedValue
    private Integer id;

    private String country;
    private String code;
    private String flag;

    @OneToMany(mappedBy = "country")
    private List<League> leagues;

    public Country(String country, String code, String flag) {
        this.country = country;
        this.code = code;
        this.flag = flag;
    }

    public Country() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", code='" + code + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }

    public static Country getCountryFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            String country = !jsonObject.get("country").equals(null) ? (String)jsonObject.get("country") : null;
            String code = !jsonObject.get("code").equals(null) ? (String)jsonObject.get("code") : null;
            String flag = !jsonObject.get("flag").equals(null) ? (String)jsonObject.get("flag") : null;

            return new Country(country,code,flag);
        }
        return null;
    }
}

