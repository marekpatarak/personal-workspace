package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

        System.out.println("exercise: " + exercise.getMinutes());
        return "addMinutes";
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
