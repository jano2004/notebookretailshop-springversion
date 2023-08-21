package serverapplication.demo.Computer.Office.Notebook.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.Computer.Office.Notebook.OfficeNotebook;
import serverapplication.demo.Stock.Stock;

@RequestMapping("/")
public class OfficeNotebookUI {
    @GetMapping
    public String showUI(Model model){
        return "officeNB";
    }

    @PostMapping("/officeNBForm")
    public void createOfficeNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
        Stock stock = Stock.getInstance();
        OfficeNotebook onb = new OfficeNotebook(windowsizeInInch, cpu, ram, layout);
        stock.addOfficeNotebook(onb);
    }
}
