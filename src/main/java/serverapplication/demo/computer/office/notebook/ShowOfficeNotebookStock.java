package serverapplication.demo.computer.office.notebook;

import org.springframework.stereotype.Service;
import serverapplication.demo.computer.gaming.notebook.GamingNotebook;
import serverapplication.demo.stock.CreateStock;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowOfficeNotebookStock {
    public List<String> getAllMonitorsizesFromOfficeNotebooks(){
        List<String> monitorsizes = new ArrayList<>();
        monitorsizes.add("13 inches");
        monitorsizes.add("14 inches");
        monitorsizes.add("15 inches");
        return monitorsizes;
    }
    public List<String> getAllLayoutsFromOfficeNotebooks(){
        List<String> layouts = new ArrayList<>();
        layouts.add("de");
        layouts.add("fr");
        layouts.add("es");
        layouts.add("it");
        layouts.add("ja");
        layouts.add("ko");
        return layouts;
    }
}
