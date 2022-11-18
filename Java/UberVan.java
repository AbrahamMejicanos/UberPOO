import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<Integer, String>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<Integer, String>> typeCarAccepted, ArrayList<String> setasMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = setasMaterial;
    }
}
