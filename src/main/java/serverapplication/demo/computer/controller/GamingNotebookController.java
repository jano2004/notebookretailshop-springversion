package serverapplication.demo.computer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.stock.GetComputersFromStock;
import serverapplication.demo.stock.MySQLConnection;
import serverapplication.demo.stock.RemoveComputerFromStock;

@RestController
@RequestMapping("/gamingNB")
public class GamingNotebookController {

    @Autowired
    GetComputersFromStock getComputersFromStock;
    @Autowired
    RemoveComputerFromStock removeComputerFromStock;

    @GetMapping
    public String showUI(Model model){
        return "gamingNB";
    }

    @PostMapping("/gamingNB")
    public String createGamingNotebook(Model model){
        return "gamingNB";
    }

    @GetMapping("/gamingNotebooks")
    public String insertIntoDropdownlist(Model model){
        model.addAttribute("gamingNotebooks", getComputersFromStock.getGamingNotebooksFromStock());
        return "gamingNB";
    }
}
