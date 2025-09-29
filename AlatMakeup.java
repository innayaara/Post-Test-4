package model;

import interfaces.Detail;

public class AlatMakeup extends ItemMakeup implements Detail {

    // Constructor
    public AlatMakeup(String nama, String jenis, String merk, int jumlah) {
        super(nama, jenis, merk, jumlah);
    }

    // Method 
    @Override
    public String info() {
        return "Nama: " + getNama() + 
               " | Jenis: " + getJenis() + 
               " | Merk: " + getMerk() + 
               " | Jumlah: " + getJumlah();
    }

    @Override
    public void tampilDetail() {
        System.out.println(info());
    }
    
    @Override
    public String toString() {
        return info();
    }
}