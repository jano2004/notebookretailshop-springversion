package serverapplication.demo.computer.gaming.notebook.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.stock.CreateStock;

@RequestMapping("/")
public class GamingNotebookController {

    @PostMapping("/gamingNBForm")
    public void createGamingNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String gpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
        CreateStock createStock = new CreateStock(0, windowsizeInInch, cpu, gpu, ram, layout);
    }
}
