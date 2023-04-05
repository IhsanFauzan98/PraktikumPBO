public class spdBalap extends Sepeda {
    private String fork;
    private String handleBar;

    public spdBalap(String nama, String warna, int harga, String fork, String handleBar) {
        super(nama, warna, harga);
        this.fork = fork;
        this.handleBar = handleBar;
    }

    public spdBalap(){}

    public void setFork(String fork) {
        this.fork = fork;
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
        System.out.println("Nama        : " + getNama());
        System.out.println("Warna       : " + getWarna());
        System.out.println("Harga       : " + getHarga());
        System.out.println("fork        : " + fork);
        System.out.println("handlebar   : " + handleBar);
        System.out.println("sepeda      : " + sepeda);
    }
}
