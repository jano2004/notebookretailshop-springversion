package serverapplication.demo.Computer.Office.PC;

import serverapplication.demo.Computer.Computer;

public class OfficePC extends Computer {
    private String cpu;
    private String ram;
    public OfficePC(String cpu, String ram){
        super(cpu, ram);
    }
    public String getCPU(){
        return cpu;
    }
    public String getRAM(){
        return ram;
    }
}
