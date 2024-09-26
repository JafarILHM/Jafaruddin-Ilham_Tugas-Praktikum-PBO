package Pertemuan5;

import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total pembelian dari pengguna
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = scanner.nextDouble();

        // Proses menghitung potongan
        double potongan;
        
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.2;
        }

        double jumlahBayar = totalPembelian - potongan;

        // Output hasil
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahBayar);

        scanner.close();
    }
}
