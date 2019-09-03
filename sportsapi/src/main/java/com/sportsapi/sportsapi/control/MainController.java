package com.sportsapi.sportsapi.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.HttpURLConnection;
import java.net.URL;

@Controller
@RequestMapping(path="/")
public class MainController {

    @GetMapping(path="/fetch")
    public String fetch() {
        try {
            String url = "https://api-football-v1.p.rapidapi.com/v2/leagues";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
            con.setRequestProperty("x-rapidapi-key", "5f113824dcmsh433d1df9d5a7b7ep151f28jsne22a50e362d0");

            int responsecode = con.getResponseCode();
            String responsemessage = con.getResponseMessage();
            String input = con.getInputStream().toString();
            return "success";


        } catch (Exception e) {
            return "error";
        }
    }
}
