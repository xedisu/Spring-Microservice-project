package com.smp.controller;

import com.smp.dto.UserDTO;
import com.smp.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    LoginService loginService;

    @GetMapping("/home")
    public String indexPage ( Model model) {
        return "home";
    }

    @GetMapping("/login")
    public String pageLogin ( Model model) {
        model.addAttribute(new UserDTO());
        return "login";
    }

    @PostMapping("/submit")
    public String submitLogin (@ModelAttribute UserDTO user) {
        loginService.createUser(user);
        return "home";
    }



}
