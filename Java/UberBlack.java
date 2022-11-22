import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String, Map<Integer, String>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver){
        super(license, driver);
    }
}
