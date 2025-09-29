package model;

public class Lipstick extends AlatMakeup{
    private String warna; 
    
    public Lipstick(String nama, String jenis, String merk, int jumlah, String warna) {
        super(nama, jenis, merk, jumlah);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String info() {
        return super.info() + " | Warna: " + warna;
    }
}
