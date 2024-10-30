class AutoCarRPL implements Transportasi {
    private Fuel bahanBakar;
    private int kecepatan;
    private Setir setir;
    private Mesin mesin;
    private Roda roda;

    public AutoCarRPL(Fuel bahanBakar, int kecepatan, Setir setir, Mesin mesin, Roda roda) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.setir = setir;
        this.mesin = mesin;
        this.roda = roda;
    }

    @Override
    public void setBahanBakar(Fuel fuel) {
        this.bahanBakar = fuel;
    }

    @Override
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public Setir getSetir() {
        return setir;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public Fuel getBahanBakar() {
        return bahanBakar;
    }

    public Roda getRoda() {
        return roda;
    }

    public void start() {
        System.out.println("Mobil dimulai...");
    }

    public void drive() {
        System.out.println("Mobil sedang berjalan dengan kecepatan " + kecepatan + " km/h.");
    }
}