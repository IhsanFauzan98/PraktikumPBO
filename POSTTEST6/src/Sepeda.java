public abstract class Sepeda {
    protected final String sepeda = "Polygon";
    private String nama;
    private String warna;
    private int nohp;
    

    public Sepeda(String nama, String warna, int nohp) {
        this.nama = nama;
        this.warna = warna;
        this.nohp = nohp;
        
    }

    public Sepeda(){}

    public String getNama() {
        return nama;
    }
    
    public String getWarna() {
        return warna;
    }

    public int getNohp() {
        return nohp;
    }

    


    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setNohp(int nohp) {
        this.nohp = nohp;
    }


    
    @Override
    public String toString() {
        return "Nama: " + nama + "\nWarna: " + warna + "\nHarga: " + nohp;
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
    public void notif(int nohp){
        System.out.println("nohp : " + nohp + " berhasil diubah!");
    }


    public abstract void list();
}
