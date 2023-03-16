import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    private static ArrayList<Sepeda> sepedaList = new ArrayList<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void tambahDataSepeda() throws IOException {
        System.out.print("Merk: ");
        String merk = br.readLine();
        System.out.print("Warna: ");
        String warna = br.readLine();
        System.out.print("Harga: ");
        int harga = Integer.parseInt(br.readLine());
        sepedaList.add(new Sepeda(merk, warna, harga));
        System.out.println("Data sepeda berhasil ditambahkan!");
    }

    private static void lihatDataSepeda() {
        if (sepedaList.isEmpty()) {
            System.out.println("Tidak ada data sepeda!");
        } else {
            System.out.println("== DATA SEPEDA ==");
            for(int i = 0; i < sepedaList.size();i++){
                System.out.println("Merk  : "+sepedaList.get(i).getMerk());
                System.out.println("Warna : "+sepedaList.get(i).getWarna());
                System.out.println("Harga : "+sepedaList.get(i).getHarga());
                System.out.println("");
            }
        }
    }

    private static void ubahDataSepeda() throws IOException {
        if (sepedaList.isEmpty()) {
            System.out.println("Tidak ada data sepeda!");
        } else {
            System.out.print("Masukkan indeks data sepeda yang ingin diubah: ");
            int index = Integer.parseInt(br.readLine());
            if (index < 0 || index >= sepedaList.size()) {
                System.out.println("Indeks tidak valid!");
            } else {
                Sepeda sepeda = sepedaList.get(index);
                System.out.println("Data sepeda dengan indeks " + index);
                System.out.println(sepeda);
                System.out.println("Masukkan data sepeda yang baru:");
                System.out.print("Merk: ");
                String merk = br.readLine();
                System.out.print("Warna: ");
                String warna = br.readLine();
                System.out.print("Harga: ");
                int harga = Integer.parseInt(br.readLine());
                sepeda.setMerk(merk);
                sepeda.setWarna(warna);
                sepeda.setHarga(harga);
                System.out.println("Data sepeda berhasil diubah!");
            }
        }
    }

    private static void hapusDataSepeda() throws IOException {
        if (sepedaList.isEmpty()) {
            System.out.println("Tidak ada data sepeda!");
        } else {
            System.out.print("Masukkan indeks data sepeda yang ingin dihapus: ");
            int index = Integer.parseInt(br.readLine());
            if (index < 0 || index >= sepedaList.size()) {
                System.out.println("Indeks tidak valid!");
            } else {
                Sepeda sepeda = sepedaList.get(index);
                sepedaList.remove(index);
                System.out.println("Data sepeda dengan indeks " + index + " berhasil dihapus:");
                System.out.println(sepeda);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("== MENU ==");
            System.out.println("1. Tambah data sepeda");
            System.out.println("2. Lihat data sepeda");
            System.out.println("3. Ubah data sepeda");
            System.out.println("4. Hapus data sepeda");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
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
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        }
    }
}

       
