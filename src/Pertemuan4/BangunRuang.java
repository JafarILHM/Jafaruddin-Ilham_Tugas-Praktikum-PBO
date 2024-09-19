package Pertemuan4;

public class BangunRuang {
    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi; 
    }

    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi; 
    }

    public double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi; 
    }

    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi); 
    }
}
