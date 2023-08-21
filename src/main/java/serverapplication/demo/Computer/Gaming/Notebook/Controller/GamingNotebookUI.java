package serverapplication.demo.Computer.Gaming.Notebook.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.Computer.Gaming.Notebook.GamingNotebook;

@RequestMapping("/")
public class GamingNotebookUI {
    @GetMapping
    public String showUI(Model model){
        return "gamingNB";
    }

    @PostMapping("/gamingNBForm")
    public String createGamingNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
        if("submit".equals(action)){
            GamingNotebook onb = new GamingNotebook(windowsizeInInch, cpu, ram, layout);
            model.addAttribute("message", "message");
        }
        return "gamingNB";
    }
}
