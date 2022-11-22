import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<Integer, String>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger >= 1 && passenger <= 6){
            this.passenger = passenger;
        }else if(passenger > 6){
            mensajeError = "No puedes subir mas de 4 pasajeros";
        }else if(passenger < 1){
            mensajeError = "El minimo de pasajeros es 1";
        }
    }
}
