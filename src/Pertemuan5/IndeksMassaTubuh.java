package Pertemuan5;

import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat badan dan tinggi badan dari pengguna
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        // Menghitung Indeks Massa Tubuh (IMT)
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria berdasarkan IMT
        String kriteria;
        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output hasil 
        System.out.println("\nNilai IMT : " + imt);
        System.out.println("Kriteria    : " + kriteria);

        scanner.close();
    }
}
