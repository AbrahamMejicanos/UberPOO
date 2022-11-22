class Car {
    private Integer id, passenger;
    private String license;
    private Account driver;

    public Car(String license, Account driver, Integer passenger){
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer x){
        if(x == 4){
            this.passenger = x; 
        }else{
            System.out.println("Necesitas almenos 4 pasajeros");
        }
    }

    public void mostrarDatos(){
        System.out.println("Licencia: " + license);
        System.out.println("Conductor: " + driver.stName());
        System.out.println("Pasajeros: " + passenger);
    }
}
