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
            System.out.print("Masukkan Nama        : ");
            String nama = br.readLine();
            System.out.print("Masukkan Warna       : ");
            String warna = br.readLine();
            System.out.print("Masukkan Nohp       : ");
            int nohp = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Harga       : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Jumlah Dibeli  : ");
            int jumlahDibeli = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Shock       : ");
            String shock = br.readLine();
            System.out.print("Masukkan Jok         : ");
            String jok = br.readLine();
            System.out.println("=============================================");
            listSpdGunung.add(new spdGunung(nama, warna, nohp, harga, jumlahDibeli, shock, jok));
            System.out.println("Data " + nama + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Sepeda Balap ==========");
            System.out.print("Masukkan Nama       : ");
            String nama = br.readLine();
            System.out.print("Masukkan Warna      : ");
            String warna = br.readLine();
            System.out.print("Masukkan Nohp       : ");
            int nohp = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Harga       : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Jumlah Dibeli  : ");
            int jumlahDibeli = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Fork       : ");
            String fork = br.readLine();
            System.out.print("Masukkan Handlebar  : ");
            String handlebar = br.readLine();
            System.out.println("=============================================");
            listSpdBalap.add(new spdBalap(nama, warna, nohp, harga, jumlahDibeli,fork, handlebar));
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
                    listSpdGunung.get(i).list();
                    System.out.println("");
                }
            }
        }else if(pil == 2){
            if (listSpdBalap.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                System.out.println("== DATA SEPEDA ==");
                for(int i = 0; i < listSpdBalap.size();i++){
                    listSpdBalap.get(i).list();
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
                for(int i = 0; i < listSpdGunung.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listSpdGunung.get(i).list();
                    }
                System.out.print("Masukkan indeks data sepeda gunung yang ingin diubah: ");
                int index = Integer.parseInt(br.readLine());
                    
                if(index <= listSpdGunung.size() || index > 0){
                    System.out.println("Masukkan data sepeda yang baru:");
                    System.out.print("Nama   : ");
                    String nama = br.readLine();
                    listSpdGunung.get(index-1).setNama(nama);

                    System.out.print("Warna  : ");
                    String warna = br.readLine();
                    listSpdGunung.get(index-1).setWarna(warna);

                    System.out.print("nohp  : ");
                    int nohp = Integer.parseInt(br.readLine());
                    listSpdGunung.get(index-1).setNohp(nohp);

                    System.out.print("Harga  : ");
                    int harga = Integer.parseInt(br.readLine());
                    listSpdGunung.get(index-1).setHarga(harga);

                    System.out.print("Jumlah  Dibeli  : ");
                    int jumlahDibeli = Integer.parseInt(br.readLine());
                    listSpdGunung.get(index-1).setJumlahDibeli(jumlahDibeli);  

                    System.out.print("Shock  : ");
                    String shock = br.readLine();
                    listSpdGunung.get(index-1).setShock(shock);

                    System.out.print("Jok    : ");
                    String jok = br.readLine();
                    listSpdGunung.get(index-1).setJok(jok);

                    listSpdGunung.get(index-1).setShock(shock);
                    listSpdGunung.get(index-1).notif(nama);
                    listSpdGunung.get(index-1).notif(harga);
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }  
    }else if(pil == 2){
            if (listSpdBalap.isEmpty()) {
                System.out.println("Tidak ada data sepeda!");
            } else {
                for(int i = 0; i < listSpdBalap.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listSpdBalap.get(i).list();
                    }
                System.out.print("Masukkan indeks data sepeda gunung yang ingin diubah: ");
                int index = Integer.parseInt(br.readLine());
                    
                if(index <= listSpdBalap.size() || index > 0){
                    System.out.println("Masukkan data sepeda yang baru:");
                    System.out.print("Nama   : ");
                    String nama = br.readLine();
                    listSpdBalap.get(index-1).setNama(nama);

                    System.out.print("Warna  : ");
                    String warna = br.readLine();
                    listSpdBalap.get(index-1).setWarna(warna);
                    
                    System.out.print("nohp  : ");
                    int nohp = Integer.parseInt(br.readLine());
                    listSpdGunung.get(index-1).setNohp(nohp);

                    System.out.print("Harga  : ");
                    int harga = Integer.parseInt(br.readLine());
                    listSpdGunung.get(index-1).setHarga(harga);

                    System.out.print("Jumlah  Dibeli  : ");
                    int jumlahDibeli = Integer.parseInt(br.readLine());
                    listSpdGunung.get(index-1).setJumlahDibeli(jumlahDibeli);  

                    System.out.print("fork  : ");
                    String fork = br.readLine();
                    listSpdBalap.get(index-1).setFork(fork);

                    System.out.print("handleBar    : ");
                    String handleBar = br.readLine();
                    listSpdBalap.get(index-1).setHandleBar(handleBar);
                    listSpdBalap.get(index-1).notif(nama);
                    listSpdBalap.get(index-1).notif(harga);
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
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

       
