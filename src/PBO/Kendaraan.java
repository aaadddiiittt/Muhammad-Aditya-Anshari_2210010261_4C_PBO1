package PBO;


public class Kendaraan {
    // Atribut
    private String merk;
    private String model;
    private int tahun;

    // Constructor
    public Kendaraan(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    // Accessor (getter)
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
    }

    // Mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Encapsulation (private attributes, public getters/setters)
    
}
