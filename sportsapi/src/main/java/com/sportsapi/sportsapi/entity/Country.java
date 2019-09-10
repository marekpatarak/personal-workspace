package com.sportsapi.sportsapi.entity;

import org.json.JSONObject;

import javax.persistence.*;
import java.util.List;

@Entity(name="country")
public class Country {

    @Id
    @GeneratedValue
    private Integer countryId;

    private String countryName;
    private String code;
    private String flag;

    @OneToMany(mappedBy = "country")
    private List<League> leagues;

    public Country() {
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", code='" + code + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }

    public static Country getCountryFromJsonObject(JSONObject jsonObject) {
        if(jsonObject != null) {
            Country country = new Country();

            country.setCountryName(!jsonObject.get("country").equals(null) ? (String)jsonObject.get("country") : null);
            country.setCode(!jsonObject.get("code").equals(null) ? (String)jsonObject.get("code") : null);
            country.setFlag(!jsonObject.get("flag").equals(null) ? (String)jsonObject.get("flag") : null);

            return country;
        }
        return null;
    }
}

