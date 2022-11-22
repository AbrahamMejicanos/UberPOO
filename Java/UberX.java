class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Marca: " + brand + " | Modelo: " + model);
    }
}
