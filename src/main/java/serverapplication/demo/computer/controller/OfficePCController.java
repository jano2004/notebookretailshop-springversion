package serverapplication.demo.computer.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.checkout.ShoppingcardController;

@RequestMapping
public class OfficePCController {

    @GetMapping
    public String showUI(Model model){
        return "officePC";
    }

    @PostMapping("/officePC")
    public String createGamingNotebook(Model model){
        return "officePC";
    }
}
