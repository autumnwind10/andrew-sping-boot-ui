package com.accenture.andrew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagePageController {
	
	@GetMapping("/manage")
    public String greeting() {
        return "manage";
    }
}
