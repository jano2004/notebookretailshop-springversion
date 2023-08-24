package serverapplication.demo.computer.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/")
public class GamingNotebookController {
    @GetMapping
    public String showUI(Model model){
        return "gamingNB";
    }

    @GetMapping("/gamingNB")
    public String createGamingNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String gpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
        return "redirect:/insertComputerIntoTextfield";
    }

    @GetMapping("/insertComputerIntoTextfield")
    public String showUIShoppingCard(Model model){
        return "shopping-card";
    }
}
