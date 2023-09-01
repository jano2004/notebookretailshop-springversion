package serverapplication.demo.stock;

import org.springframework.stereotype.Service;
import serverapplication.demo.computer.Computer;


import java.util.ArrayList;
import java.util.List;

@Service
public class Stock {
    List<Computer> computers;
    public Stock(){
        computers = new ArrayList<>();
    }

    public void addComputerToStock(Computer computer){
        computers.add(computer);
    }

    public int getStockSize(){
        return computers.size();
    }
}
