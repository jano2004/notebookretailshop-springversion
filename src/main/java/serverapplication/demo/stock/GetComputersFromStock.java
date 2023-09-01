package serverapplication.demo.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetComputersFromStock {
    @Autowired
    MySQLConnection mySQLConnection;
    public List<String> getGamingNotebooksFromStock() {
        List<String> gamingNotebooks = new ArrayList<>();
        //int tablesize = (select count(enum) from gamingNotebooks
        //for (int i = 0;  i < tablesize; i++){
        //String valueOfEntries;
        //valueOfEntries += select monitorsizeInInch from gamingNotebooks where (id == i);
        //valueOfEntries += " | " + select cpu from gamingNotebooks where (id == i);
        //valueOfEntries += " | " + select gpu from gamingNotebooks where (id == i);
        //valueOfEntries += " | " + select ram from gamingNotebooks where (id == i);
        //valueOfEntries += " | " + select layout from gamingNotebooks where (id == i);
        //gamingNotebooks.add(valueOfEntries);
        //}
        return gamingNotebooks;
    }
}
