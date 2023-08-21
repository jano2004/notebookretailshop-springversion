package serverapplication.demo.Computer.Office.PC.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.Computer.Office.PC.OfficePC;

@SpringBootApplication
@RequestMapping
public class OfficePCUI {
    @GetMapping
    public String showUI(Model model){
        return "officePC";
    }

    @PostMapping("/officePCForm")
    public String createOfficePC(@RequestParam String cpu,
                                 @RequestParam String ram,
                                 @RequestParam String action,
                                 Model model){
        if("submit".equals(action)){
            OfficePC opc = new OfficePC(cpu, ram);
            model.addAttribute("message", "createOfficePC");
        }
        return "officePC";
    }
}
