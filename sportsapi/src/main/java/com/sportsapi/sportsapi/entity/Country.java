package com.sportsapi.sportsapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    public int id;

    public String name;
    public String code;
    public String flag;

    public Country(int id, String name, String code, String flag) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.flag = flag;
    }

    public Country() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}

