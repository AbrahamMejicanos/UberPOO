class Main{
    public static void main(String[] args) {
        Account account = new Account("Abraham Mejicanos", "3020 71865 0101", "amejicanos38@gmail.com", "contra123");
        Car car = new Car("AMQ123", account);
        car.mostrarDatos();
    }
}