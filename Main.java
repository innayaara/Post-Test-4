package main;

import java.util.Scanner;
import service.KoleksiService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KoleksiService service = new KoleksiService();
        int pilihan;

        do {
            System.out.println("\n=== Menu Koleksi Alat Makeup ===");
            System.out.println("1. Tambah Koleksi");
            System.out.println("2. Lihat Koleksi");
            System.out.println("3. Ubah Koleksi");
            System.out.println("4. Hapus Koleksi");
            System.out.println("5. Cari Koleksi");
            System.out.println("6. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu: ");

            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1: service.tambahKoleksi(); break;
                case 2: service.lihatKoleksi(); break;
                case 3: service.ubahKoleksi(); break;
                case 4: service.hapusKoleksi(); break;
                case 5: service.cariKoleksi(); break;
                case 6: System.out.println("Terima kasih, program selesai!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 6);

        sc.close();
    }
}