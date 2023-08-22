package serverapplication.demo.checkout;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
public class ShoppingcardController {
    @GetMapping
    public String showUI(Model model){
        return "shopping-card";
    }
}
