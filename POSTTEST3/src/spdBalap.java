public class spdBalap extends Sepeda {
    private String fork;
    private String handleBar;

    public spdBalap(String nama, String warna, int harga, String fork, String handleBar) {
        super(nama, warna, harga);
        this.fork = fork;
        this.handleBar = handleBar;
    }

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
}
