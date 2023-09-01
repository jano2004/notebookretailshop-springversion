package serverapplication.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class UIController {
    @GetMapping
    public String showUI(Model model) {
        return "homepage";
    }

    @GetMapping("/load-css.js")
    public ResponseEntity<Resource> getLoadCssScript() {
        Resource resource = new ClassPathResource("/static/load-css.js");
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/javascript"))
                .body(resource);
    }

    @GetMapping("/gamingNotebookInformations")
    public String getGamingNotebooks(Model model, @RequestParam String action) {

        if("submitShop".equals(action)){
            return "shopping-card";
        }
        return "gamingNB";
    }

    @GetMapping("/gamingPCInformations")
    public String getGamingPCs(Model model) {

        return "gamingPC";
    }

    @GetMapping("/officeNotebookInformations")
    public String getOfficeNotebooks(Model model) {

        return "officeNB";
    }

    @GetMapping("/officePCInformations")
    public String getIOfficePC(Model model) {

        return "officePC";
    }

    @GetMapping("/homepageForm")
    public String clickOnNBorPC(@RequestParam String action, Model model) {
        String valueOfReturn = "";
        if ("officePC".equals(action)) {
            valueOfReturn = "redirect:/officePCInformations";
        } else if ("officeNB".equals(action)) {
            valueOfReturn = "redirect:/officeNotebookInformations";
        } else if ("gamingPC".equals(action)) {
            valueOfReturn = "redirect:/gamingPCInformations";
        } else if ("gamingNB".equals(action)) {
            valueOfReturn = "gamingNB";
        }
        return valueOfReturn;
    }
}


