package com.sportsapi.sportsapi.control;


import java.util.HashMap;
import java.util.Map;

public class Configuration {

    public static String RAPID_API_URL_PREFIX = "x-rapidapi-url-prefix";
    public static String RAPID_API_HOST = "x-rapidapi-host";
    public static String RAPID_API_KEY = "x-rapidapi-key";


    public static Map<String,String> properties = new HashMap<>();

    static {
        properties.put(RAPID_API_URL_PREFIX,"https://api-football-v1.p.rapidapi.com/v2/");
        properties.put(RAPID_API_HOST,"api-football-v1.p.rapidapi.com");
        properties.put(RAPID_API_KEY,"5f113824dcmsh433d1df9d5a7b7ep151f28jsne22a50e362d0");

    }

}
