package serverapplication.demo.Computer.Gaming.Notebook.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.Computer.Gaming.Notebook.GamingNotebook;
import serverapplication.demo.Stock.Stock;

@RequestMapping("/")
public class GamingNotebookUI {
    @GetMapping
    public String showUI(Model model){
        return "gamingNB";
    }

    @PostMapping("/gamingNBForm")
    public void createGamingNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
        Stock stock = Stock.getInstance();
        GamingNotebook gnb = new GamingNotebook(windowsizeInInch, cpu, ram, layout);
        stock.addGamingNotebook(gnb);
    }
}
