package serverapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.computer.gaming.notebook.ShowGamingNotebookStock;
import serverapplication.demo.computer.gaming.pc.ShowGamingPCStock;
import serverapplication.demo.computer.office.notebook.ShowOfficeNotebookStock;
import serverapplication.demo.computer.office.pc.ShowOfficePCStock;

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

    @Autowired
    private ShowGamingPCStock showGamingPCStock;

    @Autowired
    private ShowOfficeNotebookStock showOfficeNotebookStock;

    @Autowired
    private ShowOfficePCStock showOfficePCStock;

    @GetMapping("/gamingNotebookInformations")
    public String getGamingNotebooks(Model model){
        model.addAttribute("monitorsizes", showNotebookStock.getAllMonitorsizesFromNotebooks());
        model.addAttribute("cpus", showNotebookStock.getAllCpusFromNotebooks());
        model.addAttribute("gpus", showNotebookStock.getAllGpusFromNotebooks());
        model.addAttribute("rams", showNotebookStock.getAllRamFromNotebooks());
        model.addAttribute("layouts", showNotebookStock.getAllLayoutsFromNotebooks());
        return "gamingNB";
    }

    @GetMapping("/gamingPCInformations")
    public String getGamingPCs(Model model){
        model.addAttribute("cpus", showGamingPCStock.getAllCpusFromGamingPCs());
        model.addAttribute("gpus", showGamingPCStock.getAllGpusFromGamingPCs());
        model.addAttribute("rams", showGamingPCStock.getAllRamFromGamingPCs());
        model.addAttribute("coolings", showGamingPCStock.getAllCoolingsFromGamingPCs());
        return "gamingPC";
    }

    @GetMapping("/officeNotebookInformations")
    public String getOfficeNotebooks(Model model){
        model.addAttribute("monitorsizes", showOfficeNotebookStock.getAllMonitorsizesFromOfficeNotebooks());
        model.addAttribute("layouts", showOfficeNotebookStock.getAllLayoutsFromOfficeNotebooks());
        return "officeNB";
    }

    @GetMapping("/officePCInformations")
    public String getIOfficePC(Model model){
        model.addAttribute("cpus", showOfficePCStock.getAllCpusFromOfficePCs());
        model.addAttribute("rams", showOfficePCStock.getAllRamFromOfficePCs());
        return "officePC";
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
            valueOfReturn = "redirect:/officeNotebookInformations";
        } else if ("gamingPC".equals(action)){
            valueOfReturn = "redirect:/gamingPCInformations";
        } else if ("gamingNB".equals(action)){
            valueOfReturn = "redirect:/gamingNotebookInformations";
        }
        return valueOfReturn;
    }
}


