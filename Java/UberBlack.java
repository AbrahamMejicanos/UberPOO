import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String, Map<Integer, String>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, Integer passenger,Map<String, Map<Integer, String>> typeCarAccepted, ArrayList<String> setasMaterial){
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = setasMaterial;
    }
}
