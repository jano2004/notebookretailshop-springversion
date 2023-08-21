package serverapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.computer.gaming.notebook.ShowGamingNotebookStock;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class UIController {
    @GetMapping
    public String showUI(Model model){
        return "homepage";
    }

    @Autowired
    private ShowGamingNotebookStock showNotebookStock;

    @GetMapping("/gamingNB")
    public String getNotebooks(Model model){
        model.addAttribute("monitorsizes", showNotebookStock.getAllMonitorsizesFromNotebooks());
        model.addAttribute("cpus", showNotebookStock.getAllCpusFromNotebooks());
        model.addAttribute("gpus", showNotebookStock.getAllGpusFromNotebooks());
        model.addAttribute("rams", showNotebookStock.getAllRamFromNotebooks());
        model.addAttribute("layouts", showNotebookStock.getAllLayoutsFromNotebooks());
        return "gamingNB";
    }

    @GetMapping("/officePCForm")
    public String showUIOfficePC(Model model){
        return "homepage";
    }

    @GetMapping("/officeNBForm")
    public String showUIOfficeNB(Model model){
        return "homepage";
    }

    @GetMapping("/gamingPCForm")
    public String showUIGamingPC(Model model){
        return "homepage";
    }

    @GetMapping("/gamingNBForm")
    public String showUIGamingNB(Model model){
        return "homepage";
    }

    @GetMapping("/homepageForm")
    public String clickOnNBorPC(@RequestParam String action, Model model){
        String valueOfReturn = "";
        if ("officePC".equals(action)){
            valueOfReturn = "officePC";
        } else if ("officeNB".equals(action)){
            valueOfReturn = "officeNB";
        } else if ("gamingPC".equals(action)){
            valueOfReturn = "gamingPC";
        } else if ("gamingNB".equals(action)){
            valueOfReturn = "gamingNB";
        }
        return valueOfReturn;
    }
}


