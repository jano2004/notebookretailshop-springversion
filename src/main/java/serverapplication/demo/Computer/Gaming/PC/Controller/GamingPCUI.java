package serverapplication.demo.Computer.Gaming.PC.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.Computer.Gaming.PC.GamingPC;
import serverapplication.demo.Stock.Stock;

@SpringBootApplication
@RequestMapping("/")
public class GamingPCUI {
    @GetMapping
    public String showUI(Model model){

        return "gamingPC";
    }

    @GetMapping("/gamingPC")
    public void createGamingPC(@RequestParam String cpu,
                               @RequestParam String gpu,
                               @RequestParam String ram,
                               @RequestParam String cooling,
                               Model model ){
        Stock stock = Stock.getInstance();
        GamingPC gpc = new GamingPC(cpu, gpu, ram, cooling);
        stock.addGamingPC(gpc);
    }
}
