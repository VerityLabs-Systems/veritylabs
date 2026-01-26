package br.net.veritylabs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InventoryControllers {

    @GetMapping({"/inventory/index"})
    public String inventory(Model model) {
        model.addAttribute("title", "Inventory - VerityLabs");
        return "inventory/index";
    }

    @GetMapping({"/inventory/entry"})
    public String entry(Model model) {
        model.addAttribute("title", "Inventory - VerityLabs");
        return "inventory/entry";
    }
}
