package com.pluralsight.controller;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MinutesController {

    @RequestMapping(value = "addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

        System.out.println("exercise: " + exercise.getMinutes());
        return "addMinutes";
    }

    @RequestMapping(value = "activites", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<>();
        Activity run = new Activity();
        run.setDesc("run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDesc("bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDesc("swim");
        activities.add(swim);

        return activities;
    }


//    @RequestMapping(value = "addMinutesForward")
//    public String addMinutesForward(@ModelAttribute("exercise") Exercise exercise) {
//
//        System.out.println("exercise: " + exercise.getMinutes());
//        //forwards existing request
//        return "forward:addMinutes.html";
//    }
//
//    @RequestMapping(value = "addMinutesRedirect")
//    public String addMinutesRedirect(@ModelAttribute("exercise") Exercise exercise) {
//
//        System.out.println("exercise: " + exercise.getMinutes());
//        //closes request and creates new request
//        return "redirect:addMinutes.html";
//    }
}
