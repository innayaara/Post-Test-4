package model;

public class Foundation extends AlatMakeup{
    private String shade;
    
    public Foundation(String nama, String jenis, String merk, int jumlah, String shade) {
        super(nama, jenis, merk, jumlah);
        this.shade = shade;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }
    
    @Override
    public String info() {
        return super.info() + " | Shade: " + shade;
    }
}


