class Car {
    private Integer id, passenger;
    private String license, driver;

    public Car(Integer passenger, String license, String driver){
        this.passenger = passenger;
        this.license = license;
        this.driver = driver;
    }

    public void mostrarDatos(){
        System.out.println("Licencia: " + license);
        System.out.println("Conductor: " + driver);
        System.out.println("Para: " + passenger + " pasajeros");
    }
}
