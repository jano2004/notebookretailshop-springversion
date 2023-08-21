package serverapplication.demo.stock;

import serverapplication.demo.computer.gaming.notebook.GamingNotebook;
import serverapplication.demo.computer.gaming.pc.GamingPC;
import serverapplication.demo.computer.office.notebook.OfficeNotebook;
import serverapplication.demo.computer.office.pc.OfficePC;

import java.util.List;

public class CreateStock {
    private List<GamingNotebook> gamingNotebooks;
    private List<GamingPC> gamingPCs;
    private List<OfficeNotebook> officeNotebooks;
    private List<OfficePC> officePCs;
    private static CreateStock instance;
    public static CreateStock getInstance(){
        if(instance == null){
            instance = new CreateStock();
        }
        return instance;
    }
    public CreateStock(int id, String usageOne, String usageTwo, String usageThree, String usageFour, String usageFive){
        if(id == 0){
            gamingNotebooks.add(new GamingNotebook(usageOne, usageTwo, usageThree, usageFour, usageFive));
        } else if(id == 1){
            gamingPCs.add(new GamingPC(usageOne, usageTwo, usageThree, usageFive));
        } else if(id == 2){
            officeNotebooks.add(new OfficeNotebook(usageOne, usageTwo, usageThree, usageFour));
        } else if(id == 3){
            officePCs.add(new OfficePC(usageOne, usageTwo));
        }
    }

    public CreateStock(){
        //Empty
    }
    public List<GamingNotebook> getStockOfGamingNotebooks(){
        return gamingNotebooks;
    }
    public List<GamingPC> getStockOfGamingPCs(){
        return gamingPCs;
    }
    public List<OfficeNotebook> getStockOfOfficeNotebooks(){
        return officeNotebooks;
    }
    public List<OfficePC> getStockOfOfficePCs(){
        return officePCs;
    }
}
