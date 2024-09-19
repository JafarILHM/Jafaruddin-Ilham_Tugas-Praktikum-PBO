package Pertemuan4;

public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    // saya menggunakan overriding
    @Override
    public double hitungVolume(double sisi) {
        return super.hitungVolume(this.sisi); 
    }

    @Override
    public double hitungLuasPermukaan(double sisi) {
        return super.hitungLuasPermukaan(this.sisi); 
    }
}
