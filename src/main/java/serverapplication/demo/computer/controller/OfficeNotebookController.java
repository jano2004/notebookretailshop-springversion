package serverapplication.demo.computer.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.stock.CreateStock;

@RequestMapping("/")
public class OfficeNotebookController {

    @GetMapping
    public String showUI(Model model){
        return "officeNB";
    }

    @PostMapping("/officeNB")
    public String createGamingNotebook(Model model){
        return "officeNB";
    }
}
