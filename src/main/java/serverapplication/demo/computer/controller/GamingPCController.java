package serverapplication.demo.computer.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.stock.CreateStock;

@RequestMapping("/gamingPC")
public class GamingPCController {

    @GetMapping
    public String showUI(Model model){
        return "gamingPC";
    }

    @PostMapping("/gamingPC")
    public String createGamingNotebook(Model model){
        return "gamingPC";
    }
}
