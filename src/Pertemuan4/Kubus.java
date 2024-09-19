package Pertemuan4;

public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume(double sisi) {
        System.out.println("Menghitung volume Kubus");
        return super.hitungVolume(sisi); 
    }

    @Override
    public double hitungLuasPermukaan(double sisi) {
        System.out.println("Menghitung luas permukaan Kubus");
        return super.hitungLuasPermukaan(sisi); 
    }
}
