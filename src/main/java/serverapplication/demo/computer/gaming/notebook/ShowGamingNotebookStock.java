package serverapplication.demo.computer.gaming.notebook;

import org.springframework.stereotype.Service;
import serverapplication.demo.computer.gaming.notebook.GamingNotebook;
import serverapplication.demo.stock.CreateStock;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowGamingNotebookStock {
    public List<String> getAllMonitorsizesFromNotebooks(){
        CreateStock cs = new CreateStock();
        List<String> monitorsizes = new ArrayList<>();
        for (GamingNotebook gamingNotebook : cs.getStockOfGamingNotebooks()) {
            monitorsizes.add(gamingNotebook.getWindowsizeInInch());
        } return monitorsizes;
    }
    public List<String> getAllCpusFromNotebooks(){
        CreateStock cs = new CreateStock();
        List<String> cpus = new ArrayList<>();
        for (GamingNotebook gamingNotebook : cs.getStockOfGamingNotebooks()){
            cpus.add(gamingNotebook.getCpu());
        } return cpus;
    }
    public List<String> getAllGpusFromNotebooks(){
        CreateStock cs = new CreateStock();
        List<String> gpus = new ArrayList<>();
        for (GamingNotebook gamingNotebook : cs.getStockOfGamingNotebooks()){
            gpus.add(gamingNotebook.getCpu());
        } return gpus;
    }
    public List<String> getAllRamFromNotebooks(){
        CreateStock cs = new CreateStock();
        List<String> ram = new ArrayList<>();
        for (GamingNotebook gamingNotebook : cs.getStockOfGamingNotebooks()){
            ram.add(gamingNotebook.getCpu());
        } return ram;
    }
    public List<String> getAllLayoutsFromNotebooks(){
        CreateStock cs = new CreateStock();
        List<String> layouts = new ArrayList<>();
        for (GamingNotebook gamingNotebook : cs.getStockOfGamingNotebooks()){
            layouts.add(gamingNotebook.getCpu());
        } return layouts;
    }
}
