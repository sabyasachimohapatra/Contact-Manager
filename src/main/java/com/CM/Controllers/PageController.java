package com.CM.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
public String home() {
    return "home";
}

// about route

@RequestMapping("/about")
public String aboutPage() {
    return "about";
}

// services

@RequestMapping("/services")
public String servicesPage() {
    return "services";
}

// contact page

@GetMapping("/contact")
public String contact() {
    return new String("contact");
}

// this is showing login page
@GetMapping("/login")
public String login() {
    return new String("login");
}

// registration page
@GetMapping("/register")
public String register() {
    return "register";
}

}
