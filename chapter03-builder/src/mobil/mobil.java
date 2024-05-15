package mobil;

public class mobil {

    // Properti dari sebuah mobil
    private String model, warna, roda;

    // Konstruktor untuk menginisialisasi properti mobil
    public mobil(String model, String warna, int roda) {
        this.model = model;
        this.warna = warna;
        this.roda = String.valueOf(roda);
    }

    // Metode getter untuk properti mobil
    public String getModel() {
        return model;
    }

    public String getWarna() {
        return warna;
    }

    public String getRoda() {
        return roda;
    }

    // Metode untuk simulasi gerakan mobil (opsional)
    public void maju() {
        System.out.println("Mobil sedang bergerak maju.");
    }

    // Ganti method toString() untuk detail mobil yang informatif
    @Override
    public String toString() {
        return "Detail Mobil\n"
                + "-----------\n"
                + "Model: " + model + "\n"
                + "Warna: " + warna + "\n"
                + "Roda: " + roda;
    }
}
