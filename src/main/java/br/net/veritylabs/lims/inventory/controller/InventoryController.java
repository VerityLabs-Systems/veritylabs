package br.net.veritylabs.lims.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryController {

    @GetMapping("/inventory/index")
    public String inventory(Model model) {
        model.addAttribute("title", "Inventory - VerityLabs");
        return "inventory/index";
    }

    @GetMapping("/inventory/entry")
    public String entry(Model model) {
        model.addAttribute("title", "Inventory - VerityLabs");
        return "inventory/entry";
    }

    @GetMapping("/inventory/list")
    public String list(Model model) {
        model.addAttribute("title", "Inventory - VerityLabs");
        return "inventory/list";
    }

    @GetMapping("/inventory/exit")
    public String exit(Model model) {
        model.addAttribute("title", "Inventory - VerityLabs");
        return "inventory/exit";
    }
}
