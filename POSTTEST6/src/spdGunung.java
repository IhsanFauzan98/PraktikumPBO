public class spdGunung extends Sepeda implements garansi_totalharga{
    private int harga;
    private int jumlahDibeli;
    private String shock;
    private String jok;

    public spdGunung(String nama, String warna, int nohp, int harga, int jumlahDibeli, String shock, String jok) {
        super(nama, warna, nohp);
        this.harga = harga;
        this.jumlahDibeli = jumlahDibeli;
        this.shock = shock;
        this.jok = jok;

    }

    public spdGunung(){}

    public void setJok(String jok) {
        this.jok = jok;
    }

    public String getJok() {
        return jok;
    }

    public void setShock(String shock) {
        this.shock = shock;
    }

    public String getShock() {
        return shock;
    }

    public void setJumlahDibeli(int jumlahDibeli) {
        this.jumlahDibeli = jumlahDibeli;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahDibeli() {
        return jumlahDibeli;
    }

    public int getHarga() {
        return harga;
    }


    @Override
    public void deskripsi(){
        System.out.println("Sepeda gunung lebih diperuntukkan untuk offroad karena memiliki sohck yang dapat meredam guncangan dan ban yang khusus");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data sepeda gunung hanya ada: "+ i);
    }

    public void list(){
        System.out.println("Nama          : " + getNama());
        System.out.println("Warna         : " + getWarna());
        System.out.println("No Hp         : " + getNohp());
        System.out.println("Harga         : " + harga);
        System.out.println("Jumlah dibeli : " + jumlahDibeli);
        System.out.println("Shock         : " + shock);
        System.out.println("Jok           : " + jok);
        System.out.println("sepeda        : " + sepeda);
        System.out.println("Garansi       : " + Garansi());
        System.out.println("Harga Total   : " + TotalHarga());
    }

    @Override
    public String Garansi(){
        return "3 Tahun";
    }
    @Override
    public int TotalHarga(){
        return harga * jumlahDibeli;
    }
}
