package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.AlatMakeup;
import model.Lipstick;
import model.Foundation;


public class KoleksiService {
    private ArrayList<AlatMakeup> koleksi = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    // Tambah Koleksi
    public void tambahKoleksi() {
    System.out.println("Pilih jenis koleksi:");
    System.out.println("1. Alat Makeup Umum");
    System.out.println("2. Lipstick");
    System.out.println("3. Foundation");
    System.out.print("Pilihan: ");
    int pilih = Integer.parseInt(sc.nextLine());

    String nama, jenis, merk;
    int jumlah;

    // validasi seperti sebelumnya...
    do {
        System.out.print("Masukkan Nama Alat Makeup: ");
        nama = sc.nextLine().trim();
    } while (nama.isEmpty());

    do {
        System.out.print("Masukkan Jenis Alat Makeup: ");
        jenis = sc.nextLine().trim();
    } while (jenis.isEmpty());

    do {
        System.out.print("Masukkan Merk: ");
        merk = sc.nextLine().trim();
    } while (merk.isEmpty());

    do {
        System.out.print("Masukkan Jumlah Alat Makeup: ");
        String inputJumlah = sc.nextLine();
        if (inputJumlah.matches("\\d+")) {
            jumlah = Integer.parseInt(inputJumlah);
        } else {
            jumlah = -1;
            System.out.println("Jumlah harus angka positif!");
        }
    } while (jumlah <= 0);

    // Tambahan untuk subclass
    switch (pilih) {
        case 2:
            System.out.print("Masukkan Warna Lipstick: ");
            String warna = sc.nextLine();
            koleksi.add(new Lipstick(nama, jenis, merk, jumlah, warna));
            break;
        case 3:
            System.out.print("Masukkan Shade Foundation: ");
            String shade = sc.nextLine();
            koleksi.add(new Foundation(nama, jenis, merk, jumlah, shade));
            break;
        default:
            koleksi.add(new AlatMakeup(nama, jenis, merk, jumlah));
    }

    System.out.println("Koleksi berhasil ditambahkan!");
}

    
    public void lihatKoleksi() {
        if (koleksi.isEmpty()) {
            System.out.println("Koleksi masih kosong!");
        } else {
            System.out.println("\n=== Daftar Koleksi Alat Makeup ===");
            int total = 0;
            for (int i = 0; i < koleksi.size(); i++) {
                System.out.println((i + 1) + ". " + koleksi.get(i));
                total += koleksi.get(i).getJumlah();
            }
            System.out.println("Total semua alat: " + total);
        }
    }
    
    // Ubah Koleksi
    public void ubahKoleksi() {
        lihatKoleksi();
        if (koleksi.isEmpty()) return;

        System.out.print("Masukkan nomor koleksi yang mau diubah: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;
        
        if (index >= 0 && index < koleksi.size()) {
            System.out.print("Nama baru: ");
            koleksi.get(index).setNama(sc.nextLine());
            System.out.print("Jenis baru: ");
            koleksi.get(index).setJenis(sc.nextLine());
            System.out.print("Merk baru: ");
            koleksi.get(index).setMerk(sc.nextLine());
            System.out.print("Jumlah baru: ");
            koleksi.get(index).setJumlah(Integer.parseInt(sc.nextLine()));
            
            System.out.println("Koleksi berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }
    
    // Hapus Koleksi
    public void hapusKoleksi() {
        lihatKoleksi();
        if (koleksi.isEmpty()) return;

        System.out.print("Masukkan nomor koleksi yang mau dihapus: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;
        
        if (index >= 0 && index < koleksi.size()) {
            koleksi.remove(index);
            System.out.println("Koleksi berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }
    
    public void cariKoleksi() {
        System.out.print("Masukkan kata kunci pencarian (nama/merk): ");
        String keyword = sc.nextLine().toLowerCase();
        cariKoleksi(keyword); // panggil versi overloading
    }

    // Overloading
    public void cariKoleksi(String keyword) {
        keyword = keyword.toLowerCase();
        boolean found = false;

        for (AlatMakeup a : koleksi) {
            if (a.getNama().toLowerCase().contains(keyword) || a.getMerk().toLowerCase().contains(keyword)) {
                System.out.println(a); // otomatis panggil toString() yang sudah override
                found = true;
            }
        }

        if (!found) {
            System.out.println("Koleksi tidak ditemukan!");
        }
    }
}
