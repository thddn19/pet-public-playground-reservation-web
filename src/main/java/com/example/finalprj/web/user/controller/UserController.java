package com.example.finalprj.web.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/manager")
    public String manager() {
        return "manager";
    }
}