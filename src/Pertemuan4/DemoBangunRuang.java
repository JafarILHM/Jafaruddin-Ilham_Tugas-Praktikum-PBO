package Pertemuan4;

public class DemoBangunRuang {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(4);
        System.out.println("Volume Kubus: " + kubus.hitungVolume(4));
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan(4));
        
        Balok balok = new Balok(5, 3, 4);
        System.out.println("\nVolume Balok: " + balok.hitungVolume(5, 3, 4));
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan(5, 3, 4));
    }
}
