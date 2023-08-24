package serverapplication.demo.computer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.computer.gaming.notebook.ShowGamingNotebookStock;

@RestController
@RequestMapping("/gamingNB")
public class GamingNotebookController {

    @Autowired
    private ShowGamingNotebookStock showNotebookStock;

    @GetMapping
    public String showUI(Model model){
        return "gamingNB";
    }

    @PostMapping("/gamingNB")
    public String createGamingNotebook(Model model){
        return "gamingNB";
    }


}
