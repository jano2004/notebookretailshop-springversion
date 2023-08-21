package serverapplication.demo.Computer.Office.Notebook;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
public class OfficeNotebookUI {
    @GetMapping
    public String showUI(Model model){
        return "officeNB";
    }

    @PostMapping("/officeNB_form")
    public String createOfficeNotebook(@RequestParam String windowsizeInInch,
                                     @RequestParam String cpu,
                                     @RequestParam String ram,
                                     @RequestParam String layout,
                                     @RequestParam String action,
                                     Model model){
        if("submit".equals(action)){
            OfficeNotebook onb = new OfficeNotebook(windowsizeInInch, cpu, ram, layout);
            model.addAttribute("message", "createOfficeNotebook");
        }
        return "officeNB";
    }
}
