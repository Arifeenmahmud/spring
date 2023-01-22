package com.example.projectTwoStudentInfo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {

    @GetMapping("/index")
    public String signup(Model model) {

        model.addAttribute("message","signup");

        return "index";

    }

    @GetMapping("/Login")
    public String login(Model model){
        model.addAttribute("login","loginPage");

        return "Login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("dashboard","dashboardPage");

        return "dashboard";
    }

}
