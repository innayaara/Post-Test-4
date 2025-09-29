package model;

public abstract class ItemMakeup {
    private String nama;
    private String jenis;
    private String merk;
    private int jumlah;
    
    public ItemMakeup(String nama, String jenis, String merk, int Jumlah) {
        this.nama = nama;
        this.jenis = jenis;
        this.merk = merk;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void setJumlah(int jumlah, boolean tambah) {
        if (tambah) {
            this.jumlah += jumlah;
        } else {
            this.jumlah = jumlah;
        }
    }
    
    public abstract String info();
}
