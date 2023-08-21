package serverapplication.demo.computer.gaming.pc;

import serverapplication.demo.computer.Computer;

public class GamingPC extends Computer{
    private int id = 1;
    private String cpu;
    private String gpu;
    private String ram;
    private String cooling;
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
