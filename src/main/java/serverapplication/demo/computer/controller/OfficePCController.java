package serverapplication.demo.computer.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serverapplication.demo.checkout.ShoppingcardController;
import serverapplication.demo.computer.office.pc.OfficePC;
import serverapplication.demo.stock.CreateStock;

@RequestMapping
public class OfficePCController {

    @PostMapping("/officePCForm")
    public void createOfficePC(@RequestParam String cpu,
                                 @RequestParam String ram,
                                 @RequestParam String action,
                                 Model model){
        OfficePC officePC = new OfficePC(cpu, ram);
        ShoppingcardController shoppingcardController = new ShoppingcardController();
        shoppingcardController.insertComputerIntoTextfield(model, officePC);
    }
}
