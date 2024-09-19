package Pertemuan4;

public class BangunRuang {
	// Untuk kubus
    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi; 
    }

    // Untuk balok
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi; // 
    }
    
    // Untuk kubus
    public double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi; 
    }

    // Untuk balok
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi); 
    }
}
