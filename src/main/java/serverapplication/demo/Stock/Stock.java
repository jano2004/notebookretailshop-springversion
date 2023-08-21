package serverapplication.demo.Stock;

import serverapplication.demo.Computer.Computer;
import serverapplication.demo.Computer.Gaming.Notebook.GamingNotebook;
import serverapplication.demo.Computer.Gaming.PC.GamingPC;
import serverapplication.demo.Computer.Office.Notebook.OfficeNotebook;
import serverapplication.demo.Computer.Office.PC.OfficePC;

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
