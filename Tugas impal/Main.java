public class Main {
    public static void main(String[] args) {
        Fuel fuel = new Fuel("Bensin");
        Roda roda = new Roda(2);
        Setir setir = new Setir("Manual");
        Mesin mesin = new Mesin("Mesin 125cc");

        Mio mio = new Mio(fuel, 60, roda, setir, mesin);
        mio.start();
        mio.drive();
        mio.displaySetir();
        mio.displayMesin();
        mio.displayBahanBakar();
        mio.displayRoda();
    }
}
