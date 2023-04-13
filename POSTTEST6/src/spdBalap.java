

public class spdBalap extends Sepeda implements garansi_totalharga {
    private int harga;
    private int jumlahDibeli;
    private String fork;
    private String handleBar;

    public spdBalap(String nama, String warna, int nohp, int harga, int jumlahDibeli, String fork, String handleBar) {
        super(nama, warna, nohp);
        this.harga = harga;
        this.jumlahDibeli = jumlahDibeli;
        this.fork = fork;
        this.handleBar = handleBar;
    }

    public spdBalap(){}

    public void setFork(String fork) {
        this.fork = fork;
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


    
    public String getFork() {
        return fork;
    }

    public void setHandleBar(String handleBar) {
        this.handleBar = handleBar;
    }

    public String getHandleBar() {
        return handleBar;
    }

    @Override
    public void deskripsi(){
        System.out.println("Sepeda balap lebih kencang di banding sepeda gunung karena memiliki body yang lebih ramping dan ringan dan diperuntukkan buat balap");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data sepeda balap hanya ada: "+ i);
    }

    public void list(){
        System.out.println("Nama          : " + getNama());
        System.out.println("Warna         : " + getWarna());
        System.out.println("No Hp         : " + getNohp());
        System.out.println("Harga         : " + harga);
        System.out.println("Jumlah dibeli : " + jumlahDibeli);
        System.out.println("fork          : " + fork);
        System.out.println("handlebar     : " + handleBar);
        System.out.println("sepeda        : " + sepeda);
        System.out.println("Garansi       : " + Garansi());
        System.out.println("Harga Total   : " + TotalHarga());
    }


    @Override
    public String Garansi(){
        return "5 Tahun";
    }
    @Override
    public int TotalHarga(){
        return harga * jumlahDibeli;
    }
}
