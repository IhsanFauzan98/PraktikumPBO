public class Sepeda {
    private String merk;
    private String warna;
    private int harga;

    public Sepeda(String merk, String warna, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }
    
    public String getWarna() {
        return warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Merk: " + merk + "\nWarna: " + warna + "\nHarga: " + harga;
    }
}
