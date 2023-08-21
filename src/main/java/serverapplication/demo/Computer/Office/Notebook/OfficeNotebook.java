package serverapplication.demo.Computer.Office.Notebook;

import serverapplication.demo.Computer.Computer;

public class OfficeNotebook extends Computer {
    private String cpu;
    private String ram;
    protected String windowsizeInInch;
    protected String layout;

    public OfficeNotebook(String windowsizeInInch, String cpu, String ram, String layout){
        super(cpu, ram);
        this.windowsizeInInch = windowsizeInInch;
        this.layout = layout;
    }
}
