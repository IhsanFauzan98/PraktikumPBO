import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    private static ArrayList<spdGunung> listSpdGunung = new ArrayList<>();
    private static ArrayList<spdBalap> listSpdBalap = new ArrayList<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void tambahDataSepeda() throws IOException {
        // System.out.print("Nama: ");
        // String nama = br.readLine();
        // System.out.print("Warna: ");
        // String warna = br.readLine();
        // System.out.print("Harga: ");
        // int harga = Integer.parseInt(br.readLine());
        // sepedaList.add(new Sepeda(nama, warna, harga));
        // System.out.println("Data sepeda berhasil ditambahkan!");

        System.out.println("Jenis Sepeda");
        System.out.println("1. Sepeda Gunung");
        System.out.println("2. Sepeda Balap");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Sepeda Gunung ==========");
            System.out.print("Masukkan Nama         : ");
            String nama = br.readLine();
            System.out.print("Masukkan Warna          : ");
            String warna = br.readLine();
            System.out.print("Masukkan Harga          : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Shock       : ");
            String shock = br.readLine();
            System.out.print("Masukkan Jok : ");
            String jok = br.readLine();
            System.out.println("=============================================");
            listSpdGunung.add(new spdGunung(nama, warna, harga, shock, jok));
            System.out.println("Data " + nama + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Sepeda Balap ==========");
            System.out.print("Masukkan Nama         : ");
            String nama = br.readLine();
            System.out.print("Masukkan Warna          : ");
            String warna = br.readLine();
            System.out.print("Masukkan Harga          : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Fork       : ");
            String fork = br.readLine();
            System.out.print("Masukkan Handlebar : ");
            String handlebar = br.readLine();
            System.out.println("=============================================");
            listSpdBalap.add(new spdBalap(nama, warna, harga, fork, handlebar));
            System.out.println("Data " + nama + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }

    private static void lihatDataSepeda() throws IOException {
        System.out.println("Jenis Sepeda");
        System.out.println("1. Sepeda Gunung");
        System.out.println("2. Sepeda Balap");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            if (listSpdGunung.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.println("== DATA SEPEDA ==");
                for(int i = 0; i < listSpdGunung.size();i++){
                    System.out.println("Nama  : "+listSpdGunung.get(i).getNama());
                    System.out.println("Warna : "+listSpdGunung.get(i).getWarna());
                    System.out.println("Harga : "+listSpdGunung.get(i).getHarga());
                    System.out.println("Shock : "+listSpdGunung.get(i).getShock());
                    System.out.println("Jok   : "+listSpdGunung.get(i).getJok());
                    System.out.println("");
                }
            }
        }else if(pil == 2){
            if (listSpdBalap.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.println("== DATA SEPEDA ==");
                for(int i = 0; i < listSpdBalap.size();i++){
                    System.out.println("Nama  : "+listSpdBalap.get(i).getNama());
                    System.out.println("Warna : "+listSpdBalap.get(i).getWarna());
                    System.out.println("Harga : "+listSpdBalap.get(i).getHarga());
                    System.out.println("Fork  : "+listSpdBalap.get(i).getFork());
                    System.out.println("Handlebar : "+listSpdBalap.get(i).getHandleBar());
                    System.out.println("");
                }
            }
        }else{
            System.out.println("Pilihan Salah");
        }
    }

    private static void ubahDataSepeda() throws IOException {
        System.out.println("Jenis Sepeda");
        System.out.println("1. Sepeda Gunung");
        System.out.println("2. Sepeda Balap");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            if (listSpdGunung.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.print("Masukkan indeks data sepeda yang ingin diubah: ");
                int index = Integer.parseInt(br.readLine());
                if (index < 0 || index >= listSpdGunung.size()) {
                    System.out.println("Indeks tidak valid!");
                } else {
                    spdGunung sepeda = listSpdGunung.get(index);
                    System.out.println("Data sepeda dengan indeks " + index);
                    System.out.println(sepeda);
                    System.out.println("Masukkan data sepeda yang baru:");
                    System.out.print("Nama: ");
                    String nama = br.readLine();
                    System.out.print("Warna: ");
                    String warna = br.readLine();
                    System.out.print("Harga: ");
                    int harga = Integer.parseInt(br.readLine());
                    System.out.print("Shock: ");
                    String shock = br.readLine();
                    System.out.print("Jok: ");
                    String jok = br.readLine();
                    sepeda.setNama(nama);
                    sepeda.setWarna(warna);
                    sepeda.setHarga(harga);
                    sepeda.setJok(jok);
                    sepeda.setShock(shock);
                    System.out.println("Data sepeda berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listSpdBalap.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.print("Masukkan indeks data sepeda yang ingin diubah: ");
                int index = Integer.parseInt(br.readLine());
                if (index < 0 || index >= listSpdBalap.size()) {
                    System.out.println("Indeks tidak valid!");
                } else {
                    spdBalap sepeda = listSpdBalap.get(index);
                    System.out.println("Data sepeda dengan indeks " + index);
                    System.out.println(sepeda);
                    System.out.println("Masukkan data sepeda yang baru:");
                    System.out.print("Nama: ");
                    String nama = br.readLine();
                    System.out.print("Warna: ");
                    String warna = br.readLine();
                    System.out.print("Harga: ");
                    int harga = Integer.parseInt(br.readLine());
                    System.out.print("Fork: ");
                    String fork = br.readLine();
                    System.out.print("Handlebar: ");
                    String handlebar = br.readLine();
                    sepeda.setNama(nama);
                    sepeda.setWarna(warna);
                    sepeda.setHarga(harga);
                    sepeda.setFork(fork);
                    sepeda.setHandleBar(handlebar);
                    System.out.println("Data sepeda berhasil diubah!");
                }
            }
        }else{
            System.out.println("Pilihan Salah!");
        }
    }

    private static void hapusDataSepeda() throws IOException {
        System.out.println("Jenis Sepeda");
        System.out.println("1. Sepeda Gunung");
        System.out.println("2. Sepeda Balap");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            if (listSpdGunung.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.print("Masukkan indeks data sepeda yang ingin dihapus: ");
                int index = Integer.parseInt(br.readLine());
                if (index < 0 || index >= listSpdGunung.size()) {
                    System.out.println("Indeks tidak valid!");
                } else {
                    spdGunung sepeda = listSpdGunung.get(index);
                    listSpdGunung.remove(index);
                    System.out.println("Data sepeda dengan indeks " + index + " berhasil dihapus:");
                    System.out.println(sepeda);
                }
            }
        }else if(pil == 2){
            if (listSpdBalap.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.print("Masukkan indeks data sepeda yang ingin dihapus: ");
                int index = Integer.parseInt(br.readLine());
                if (index < 0 || index >= listSpdBalap.size()) {
                    System.out.println("Indeks tidak valid!");
                } else {
                    spdBalap sepeda = listSpdBalap.get(index);
                    listSpdBalap.remove(index);
                    System.out.println("Data sepeda dengan indeks " + index + " berhasil dihapus:");
                    System.out.println(sepeda);
                }
            }
        }else{
            System.out.println("Pilihan Salah!");
        }
    }

    public static void DeskripsiSepeda() throws IOException{
        spdGunung spdGunung = new spdGunung();
        spdBalap spdBalap = new spdBalap();

        System.out.println("Jenis Sepeda");
        System.out.println("1. Sepeda Gunung");
        System.out.println("2. Sepeda Balap");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            spdGunung.deskripsi();
            spdGunung.deskripsi(listSpdGunung.size());
        }else if(pil == 2){
            spdBalap.deskripsi();
            spdBalap.deskripsi(listSpdBalap.size());
        }else{
            System.out.println("Piilihan salah!");
        }
    }

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("== MENU ==");
            System.out.println("1. Tambah data sepeda");
            System.out.println("2. Lihat data sepeda");
            System.out.println("3. Ubah data sepeda");
            System.out.println("4. Hapus data sepeda");
            System.out.println("5. Deskripsi sepeda");
            System.out.println("6. Exit");
            System.out.print("Pilih menu (1-6): ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:
                    tambahDataSepeda();
                    break;
                case 2:
                    lihatDataSepeda();
                    break;
                case 3:
                    ubahDataSepeda();
                    break;
                case 4:
                    hapusDataSepeda();
                    break;
                case 5:
                    DeskripsiSepeda();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        }
    }
}

       
