class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, Integer passenger, String brand, String model){
        super(license, driver, passenger);
        this.brand = brand;
        this.model = model;
    }
}
