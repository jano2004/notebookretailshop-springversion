package serverapplication.demo.computer.gaming.pc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.stock.CreateStock;

@RequestMapping("/")
public class GamingPCController {

    @GetMapping("/gamingPC")
    public void createGamingPC(@RequestParam String cpu,
                               @RequestParam String gpu,
                               @RequestParam String ram,
                               @RequestParam String cooling,
                               Model model ){
        CreateStock createStock = new CreateStock(1, cpu, gpu, ram, cooling, null);
    }
}
