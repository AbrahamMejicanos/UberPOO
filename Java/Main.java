class Main{
    public static void main(String[] args) {
        UberX uberX = new UberX("AYE212", new Account("Abraham Mejicanos", "3020 71865 0101", "amejicanos38@gmail.com", "contra123"), "Toyota", "Yaris");
        uberX.setPassenger(2);
        uberX.mostrarDatos();

        System.out.println("---------------------------------");

        UberVan uberVan = new UberVan("TEM398", new Account("Abraham Mejicanos", "3020 71865 0101", "amejicanos38@gmail.com", "Contra123"));
        uberVan.setPassenger(4);
        uberVan.mostrarDatos();
    }
}