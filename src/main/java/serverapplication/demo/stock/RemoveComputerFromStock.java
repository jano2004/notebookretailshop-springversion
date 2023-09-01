package serverapplication.demo.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveComputerFromStock {
    public void removeGamingNotebookFromStock(String monitorsizeInInch,
                                              String cpu,
                                              String gpu,
                                              String ram,
                                              String layout){
        //Look for this Gaming Notebook in Database
        //Remove this Gaming Notebook from Database
    }
    public void removeGamingPCFromStock(String cpu,
                                        String gpu,
                                        String ram,
                                        String cooling){
        //Look for this Gaming PC in Database
        //Remove this Gaming PC from Database
    }
    public void removeOfficeNotebookFromStock(String monitorsizeInInch,
                                              String layout){
        //Look for this Gaming PC in Database
        //Remove this Gaming PC from Database
    }
    public void removeOfficePCFromStock(String cpu,
                                        String ram){
        //Look for this Gaming PC in Database
        //Remove this Gaming PC from Database
    }
}
