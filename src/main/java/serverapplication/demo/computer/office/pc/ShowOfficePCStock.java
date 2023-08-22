package serverapplication.demo.computer.office.pc;

import org.springframework.stereotype.Service;
import serverapplication.demo.computer.gaming.notebook.GamingNotebook;
import serverapplication.demo.stock.CreateStock;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowOfficePCStock {
    public List<String> getAllCpusFromOfficePCs(){
        List<String> cpus = new ArrayList<>();
        cpus.add("Intel Core i9-11900K");
        cpus.add("AMD Ryzen 9 5950X");
        cpus.add("Intel Core i7-11700K");
        cpus.add("AMD Ryzen 7 5800X");
        cpus.add("Intel Core i5-11600K");
        cpus.add("AMD Ryzen 5 5600X");
        cpus.add("Intel Core i9-10900K");
        cpus.add("AMD Ryzen 9 5900X");
        cpus.add("Intel Core i7-10700K");
        cpus.add("AMD Ryzen 7 3700X");
        cpus.add("Intel Core i5-10600K");
        cpus.add("AMD Ryzen 5 3600X");
        cpus.add("Intel Core i9-9900K");
        cpus.add("AMD Ryzen 9 3900X");
        cpus.add("Intel Core i7-9700K");
        cpus.add("AMD Ryzen 7 2700X");
        cpus.add("Intel Core i5-9600K");
        cpus.add("AMD Ryzen 5 2600X");
        cpus.add("Intel Core i9-7900X");
        cpus.add("AMD Ryzen 9 3900");
        return cpus;
    }
    public List<String> getAllRamFromOfficePCs(){
        List<String> ram = new ArrayList<>();
        ram.add("8 GB");
        ram.add("16 GB");
        ram.add("32 GB");
        ram.add("64 GB");
        ram.add("128 GB");
        ram.add("256 GB");
        return ram;
    }
}
