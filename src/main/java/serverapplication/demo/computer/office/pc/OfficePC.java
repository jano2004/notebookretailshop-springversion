package serverapplication.demo.computer.office.pc;

import serverapplication.demo.computer.Computer;

public class OfficePC extends Computer {
    protected int id = 3;
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
