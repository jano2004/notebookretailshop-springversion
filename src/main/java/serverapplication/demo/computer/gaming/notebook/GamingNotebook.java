package serverapplication.demo.computer.gaming.notebook;

import serverapplication.demo.computer.Computer;

public class GamingNotebook extends Computer {
    protected int id = 0;
    protected String gpu;
    protected String windowsizeInInch;
    protected String layout;

    public GamingNotebook(String windowsizeInInch, String cpu, String gpu, String ram, String layout){
        super(cpu, ram);
        this.windowsizeInInch = windowsizeInInch;
        this.layout = layout;
    }
    public String getCpu(){
        return cpu;
    }
    public String getRam(){
        return ram;
    }
    public String getGpu(){
        return gpu;
    }
    public String getWindowsizeInInch(){
        return windowsizeInInch;
    }
    public String getLayout(){
        return layout;
    }
}
