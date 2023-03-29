public class Sepeda {
    private String nama;
    private String warna;
    private int harga;

    public Sepeda(String nama, String warna, int harga) {
        this.nama = nama;
        this.warna = warna;
        this.harga = harga;
    }

    public Sepeda(){}

    public String getNama() {
        return nama;
    }
    
    public String getWarna() {
        return warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nWarna: " + warna + "\nHarga: " + harga;
    }

    public void deskripsi(){
        System.out.println("sepeda sangat baik untuk kesehatan terutama jantung");
    }

    public void deskripsi(int i){
        System.out.println("Data sepeda hanya ada: "+ i);
    }
}
