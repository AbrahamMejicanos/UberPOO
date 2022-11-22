class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger;
    protected String mensajeError;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void setPassenger(Integer x){
        if(x >= 1 && x <= 4){
            this.passenger = x; 
        }else if(x > 4){
            mensajeError = "No puedes subir mas de 4 pasajeros";
        }else if(x < 1){
            mensajeError = "El minimo de pasajeros es 1";
        }
    }

    public void mostrarDatos(){
        if(passenger != null){
            System.out.println("Licencia: " + license);
            System.out.println("Conductor: " + driver.gtName());
            System.out.println("Pasajeros: " + passenger);
        }else{
            System.out.println("Error: " + mensajeError);
        }
    }
}
