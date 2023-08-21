package serverapplication.demo.Computer.Gaming.PC;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RequestMapping("/")
public class GamingPCUI {
    @GetMapping
    public String showUI(Model model){
        return "gamingPC";
    }

    @PostMapping("/gamingPC_form")
    public String createGamingPC(@RequestParam String action){
        if("submit".equals(action)){
            return "creationComfirmed";
        }
        return "gamingPC";
    }
}
