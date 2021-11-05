package org.teron.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.teron.dao.UserDAO;
import org.teron.models.User;

@Controller

public class UserController {

    private final UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model){
    public String show( @ModelAttribute("user") User user, Model model,
                        @PathVariable("id") int id){
//        User localUser = userDAO.show(user.getName());
        model.addAttribute("user", userDAO.show(1));
        System.out.println(user.getId());
        return "user/user_information";
    }

}
