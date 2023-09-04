package com.example.songer.routes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SayHello {


    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello/")
    public String helloUser(Model model) {
        model.addAttribute("Message", "Balqees");
        return "helloUser.html";

    }

}
