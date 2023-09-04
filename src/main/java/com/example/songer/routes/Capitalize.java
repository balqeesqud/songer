package com.example.songer.routes;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Capitalize {

    @GetMapping("/capitalize/{input}")
    public String capitalize(@PathVariable String input, Model model) {
        String capitalized = input.toUpperCase();
        model.addAttribute("result", capitalized);
        return "capitalized.html";
    }



}
