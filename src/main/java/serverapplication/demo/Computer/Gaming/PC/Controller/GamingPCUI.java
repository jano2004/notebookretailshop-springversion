package serverapplication.demo.Computer.Gaming.PC.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.Computer.Gaming.PC.GamingPC;

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
        GamingPC gpc = new GamingPC(cpu, gpu, ram, cooling);
    }
}
