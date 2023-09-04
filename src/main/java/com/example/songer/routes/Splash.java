package com.example.songer.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Splash {

    @GetMapping("/home")
    public String splash(){
        return "splash.html";
    }
}
