package org.teron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teron.models.User;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping()
    public String loginOrRegister(){
        return "main/initiation";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute("user") User user){
        return "main/login";
    }

    @GetMapping("/registration")
    public String register(@ModelAttribute("user") User user){

        return "main/registration";
    }

}
