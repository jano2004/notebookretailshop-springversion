package serverapplication.demo.computer.office.pc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.stock.CreateStock;

@RequestMapping
public class OfficePCController {

    @PostMapping("/officePCForm")
    public void createOfficePC(@RequestParam String cpu,
                                 @RequestParam String ram,
                                 @RequestParam String action,
                                 Model model){
    }
}
