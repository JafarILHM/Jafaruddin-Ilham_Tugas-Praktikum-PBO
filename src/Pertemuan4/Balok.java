package Pertemuan4;

public class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // saya menggunakan overriding
    @Override
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return super.hitungVolume(this.panjang, this.lebar, this.tinggi); 
    }

    @Override
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return super.hitungLuasPermukaan(this.panjang, this.lebar, this.tinggi); 
    }
}
