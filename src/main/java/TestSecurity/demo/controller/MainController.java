package TestSecurity.demo.controller;

import TestSecurity.demo.dto.JoinDTO;
import TestSecurity.demo.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    //생성자 주입으로 변경하기
    @Autowired
    private JoinService joinService;

    @GetMapping("/")
    public String mainP() {
        return "main";
    }

    @GetMapping("/login")
    public String loginP() {
        return "login";
    }

    @GetMapping("/join")
    public String joinP() {
        return "join";
    }

    @PostMapping("/signup")
    public String signupP(JoinDTO joinDTO) {

        joinService.joinProcess(joinDTO);

        //회원가입 실패 시 어디로 연결?
        return "redirect:/login";
    }
}
