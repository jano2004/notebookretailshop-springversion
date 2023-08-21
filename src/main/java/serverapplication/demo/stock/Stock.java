package serverapplication.demo.stock;

import serverapplication.demo.computer.Computer;
import serverapplication.demo.computer.gaming.notebook.GamingNotebook;
import serverapplication.demo.computer.gaming.pc.GamingPC;
import serverapplication.demo.computer.office.notebook.OfficeNotebook;
import serverapplication.demo.computer.office.pc.OfficePC;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private static Stock instance;
    List<Computer> computers;
    private Stock(){
        computers = new ArrayList<>();
    }
    public static Stock getInstance(){
        if(instance == null){
            instance = new Stock();
        }
        return instance;
    }
    public void addGamingNotebook(GamingNotebook gamingNotebook){
        computers.add(gamingNotebook);
    }
    public void addGamingPC(GamingPC gamingpc){
        computers.add(gamingpc);
    }
    public void addOfficeNotebook(OfficeNotebook officeNotebook){
        computers.add(officeNotebook);
    }
    public void addOfficePC(OfficePC officePC){
        computers.add(officePC);
    }
    public int getStockSize(){
        return computers.size();
    }
}
