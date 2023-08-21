package serverapplication.demo.checkout;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RequestMapping("/")
public class ShoppingcardUI {
    @GetMapping
    public String showUI(Model model){
        return "shopping-card";
    }
}
