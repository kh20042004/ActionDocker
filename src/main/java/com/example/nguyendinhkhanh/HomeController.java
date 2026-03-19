package com.example.nguyendinhkhanh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "redirect:/saigon.html";
    }
    
    @GetMapping("/saigon")
    public String saigon() {
        return "redirect:/saigon.html";
    }
}
