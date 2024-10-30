class Mio extends AutoCarRPL {
    public Mio(Fuel bahanBakar, int kecepatan, Roda roda, Setir setir, Mesin mesin) {
        super(bahanBakar, kecepatan, setir, mesin, roda);
    }
    @Override
    public void start() {
        System.out.println("Mio Dinyalakan");
    }
    @Override
    public void drive() {
        System.out.println("Mio sedang berjalan dengan kecepatan " + getKecepatan() + " km/h.");
    }
    public void displaySetir() {
        System.out.println("Mio menggunakan setir : " + getSetir().getTipeSetir());
    }
    public void displayMesin() {
        System.out.println("Mio menggunakan mesin: " + getMesin().getJenisMesin());
    }
    public void displayBahanBakar() {
        System.out.println("Mio menggunakan bahan bakar: " + getBahanBakar().getJenisBahanBakar());
    }
    public void displayRoda() {
        System.out.println("Mio memiliki jumlah roda: " + getRoda().getJumlahRoda());
    }
}