package serverapplication.demo.Computer.Gaming.Notebook;

import serverapplication.demo.Computer.Computer;

public class GamingNotebook extends Computer {
    private String cpu;
    private String ram;
    protected String windowsizeInInch;
    protected String layout;

    public GamingNotebook(String windowsizeInInch, String cpu, String ram, String layout){
        super(cpu, ram);
        this.windowsizeInInch = windowsizeInInch;
        this.layout = layout;
    }
}
