public class spdGunung extends Sepeda {
    private String shock;
    private String jok;

    public spdGunung(String nama, String warna, int harga, String shock, String jok) {
        super(nama, warna, harga);
        this.shock = shock;
        this.jok = jok;

    }

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

}
