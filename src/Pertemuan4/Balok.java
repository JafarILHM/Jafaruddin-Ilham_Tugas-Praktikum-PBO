package Pertemuan4;

public class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        System.out.println("Menghitung volume Balok");
        return super.hitungVolume(panjang, lebar, tinggi); 
    }

    @Override
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        System.out.println("Menghitung luas permukaan Balok");
        return super.hitungLuasPermukaan(panjang, lebar, tinggi); 
    }
}
