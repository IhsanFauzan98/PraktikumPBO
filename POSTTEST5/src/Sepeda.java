public abstract class Sepeda {
    protected final String sepeda = "Polygon";
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

    public void notif(String nama){
        System.out.println("Data sepeda dengan nama : " + nama + " dan");
    }
    public void notif(int harga){
        System.out.println("harga : " + harga + " berhasil diubah!");
    }


    public abstract void list();
}
