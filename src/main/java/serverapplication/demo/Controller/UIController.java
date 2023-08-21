package serverapplication.demo.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serverapplication.demo.Stock.MySQLConnection;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class UIController {
    @GetMapping
    public String showUI(Model model){
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


