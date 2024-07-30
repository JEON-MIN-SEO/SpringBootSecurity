package TestSecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainP() {
        return "main";
    }

    @GetMapping("/login")
    public String loginP() {
        return "login";
    }
}
