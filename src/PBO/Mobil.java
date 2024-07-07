package PBO;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, String model, int tahun, int jumlahPintu) {
        super(merk, model, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    // Inherit getMerk(), getModel(), getTahun() from Kendaraan

    // Polymorphism
    @Override
    public String toString() {
        return "Mobil{merk='" + getMerk() + "', model='" + getModel() + "', tahun=" + getTahun() + ", jumlahPintu=" + jumlahPintu + "}";
    }
}
