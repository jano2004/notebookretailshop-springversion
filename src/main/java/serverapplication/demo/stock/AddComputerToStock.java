package serverapplication.demo.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverapplication.demo.computer.Computer;


@Service
public class AddComputerToStock {

    @Autowired
    Stock stock;

    public void addGamingNotebookToStock(String monitorsizeInInch,
                                         String cpu,
                                         String gpu,
                                         String ram,
                                         String layout){
        Computer computer = new Computer(monitorsizeInInch, cpu, gpu, ram, layout, null);
        stock.addComputerToStock(computer);
    }
}
