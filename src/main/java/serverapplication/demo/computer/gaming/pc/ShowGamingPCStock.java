package serverapplication.demo.computer.gaming.pc;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowGamingPCStock {
    public List<String> getAllCpusFromGamingPCs(){
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
    public List<String> getAllGpusFromGamingPCs(){
        List<String> gpus = new ArrayList<>();
        gpus.add("NVIDIA GeForce RTX 3090");
        gpus.add("AMD Radeon RX 6900 XT");
        gpus.add("NVIDIA GeForce RTX 3080");
        gpus.add("AMD Radeon RX 6800 XT");
        gpus.add("NVIDIA GeForce RTX 3070");
        gpus.add("AMD Radeon RX 6700 XT");
        gpus.add("NVIDIA GeForce RTX 3060 Ti");
        gpus.add("AMD Radeon RX 6600 XT");
        gpus.add("NVIDIA GeForce RTX 2080 Ti");
        gpus.add("AMD Radeon RX 5700 XT");
        gpus.add("NVIDIA GeForce RTX 2080 Super");
        gpus.add("AMD Radeon RX 5600 XT");
        gpus.add("NVIDIA GeForce GTX 1080 Ti");
        gpus.add("AMD Radeon RX 5500 XT");
        gpus.add("NVIDIA GeForce GTX 1080");
        gpus.add("AMD Radeon RX 5400 XT");
        gpus.add("NVIDIA GeForce GTX 1070");
        gpus.add("AMD Radeon RX 5300 XT");
        gpus.add("NVIDIA GeForce GTX 1060");
        gpus.add("AMD Radeon RX 5200");
        return gpus;
    }
    public List<String> getAllRamFromGamingPCs(){
        List<String> ram = new ArrayList<>();
        ram.add("8 GB");
        ram.add("16 GB");
        ram.add("32 GB");
        ram.add("64 GB");
        ram.add("128 GB");
        ram.add("256 GB");
        return ram;
    }
    public List<String> getAllCoolingsFromGamingPCs(){
        List<String> coolings = new ArrayList<>();
        coolings.add("AIO (All in one)");
        coolings.add("Block");
        return coolings;
    }
}
