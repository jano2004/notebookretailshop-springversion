package serverapplication.demo.computer.office.notebook;

import serverapplication.demo.computer.Computer;

public class OfficeNotebook extends Computer {
    private int id = 2;
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
