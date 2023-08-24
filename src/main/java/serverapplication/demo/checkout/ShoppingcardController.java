package serverapplication.demo.checkout;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.computer.Computer;

@RestController
@RequestMapping("/shopping-card")
public class ShoppingcardController {
    @GetMapping
    public String showUI(Model model){
        return "shopping-card";
    }

    @GetMapping("/shopping-card")
    public String insertComputerIntoTextfield(Model model, Computer computer){
        model.addAttribute("valueFromBackend", computer);
        return "shopping-card";
    }
}
