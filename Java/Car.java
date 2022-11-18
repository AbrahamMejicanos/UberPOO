class Car {
    private Integer id, passenger;
    private String license;
    private Account driver;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void mostrarDatos(){
        System.out.println("Licencia: " + license);
        System.out.println("Conductor: " + driver.stName());
    }
}
