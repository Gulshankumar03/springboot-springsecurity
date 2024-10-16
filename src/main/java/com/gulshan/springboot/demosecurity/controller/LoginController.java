package com.gulshan.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "myLoginPage";
    }
    @GetMapping("/access-denied")
    public String showAccessDeniedPage() {
        return "access-denied";
    }
}
