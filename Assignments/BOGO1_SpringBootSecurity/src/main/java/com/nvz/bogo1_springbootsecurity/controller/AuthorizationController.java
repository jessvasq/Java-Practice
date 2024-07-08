package com.nvz.bogo1_springbootsecurity.controller;

import com.nvz.bogo1_springbootsecurity.entity.ArtCollector;
import com.nvz.bogo1_springbootsecurity.services.ArtCollectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorizationController {

    private ArtCollectorService artCollectorService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("artCollector", new ArtCollector());
        return "art-collector-registration";
    }

    @PostMapping("/register/save")
    public String registerArtCollector(@ModelAttribute("artCollector") ArtCollector artCollector) {
        artCollectorService.saveArtCollector(artCollector);
        return "redirect:/register?success";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/artcollectors")
    public String listArtCollectors(Model model) {
        model.addAttribute("artCollectors", artCollectorService.findAllArtCollectors());
        return "registered-art-collectors";
    }
}