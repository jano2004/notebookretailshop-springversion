package serverapplication.demo.Computer.Office.PC.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.Computer.Office.PC.OfficePC;
import serverapplication.demo.Stock.Stock;

@SpringBootApplication
@RequestMapping
public class OfficePCUI {
    @GetMapping
    public String showUI(Model model){
        return "officePC";
    }

    @PostMapping("/officePCForm")
    public void createOfficePC(@RequestParam String cpu,
                                 @RequestParam String ram,
                                 @RequestParam String action,
                                 Model model){
        Stock stock = Stock.getInstance();
        OfficePC opc = new OfficePC(cpu, ram);
        stock.addOfficePC(opc);
    }
}
