package serverapplication.demo.computer.office.notebook.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.stock.CreateStock;

@RequestMapping("/")
public class OfficeNotebookController {

    @PostMapping("/officeNBForm")
    public void createOfficeNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
    }
}
