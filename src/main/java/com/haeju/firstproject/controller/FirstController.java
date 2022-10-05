package com.haeju.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/greetings")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "Haeju");
        return "greetings";
    }
}
