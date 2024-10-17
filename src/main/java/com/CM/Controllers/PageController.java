package com.CM.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.CM.services.UserServices;
import com.CM.entities.SignupForm;
import com.CM.entities.User;



@Controller
public class PageController {
    @Autowired
    private UserServices userServices;
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


    @RequestMapping(value="/do-register", method=RequestMethod.POST)
    public String requestMethodName(@ModelAttribute SignupForm userrform) {
     try {
        User user = new User();
     user.setName(userrform.getName());
     user.setEmail(userrform.getEmail());
     user.setPassword(userrform.getPassword());
     user.setPhoneNumber(userrform.getPhoneNumber());
     user.setAbout(userrform.getAbout());
      userServices.saveUser(user);
     System.out.println(user);
     } catch (Exception e) {
        e.printStackTrace();
        e.getMessage();
     }
        return "redirect:/register";
    }
    
    
}
