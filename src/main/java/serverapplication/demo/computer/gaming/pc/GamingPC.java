package serverapplication.demo.computer.gaming.pc;

import serverapplication.demo.computer.Computer;

public class GamingPC extends Computer{
    protected int id = 1;
    protected String gpu;
    protected String cooling;
    public GamingPC(String cpu, String gpu, String ram, String cooling){
        super(cpu, ram);
        this.cooling = cooling;
        this.gpu = gpu;
    }
    public String getCPU(){
        return cpu;
    }
    public String getGPU(){
        return gpu;
    }
    public String getRAM(){
        return ram;
    }
    public String getCooling(){
        return cooling;
    }
}
