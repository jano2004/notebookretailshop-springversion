package serverapplication.demo.computer.office.pc.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.stock.CreateStock;

@SpringBootApplication
@RequestMapping
public class OfficePCUI {

    @PostMapping("/officePCForm")
    public void createOfficePC(@RequestParam String cpu,
                                 @RequestParam String ram,
                                 @RequestParam String action,
                                 Model model){
        CreateStock createStock = new CreateStock(3, cpu, ram, null, null, null);
    }
}
