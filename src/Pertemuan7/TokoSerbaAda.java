package Pertemuan7;

import java.util.Scanner;

public class TokoSerbaAda {
	// Data barang yang tersedia untuk dibeli
    public static String getNamaBarang(String kode) {
        switch (kode) {
            case "a001": return "Buku";
            case "a002": return "Pensil";
            case "a003": return "Pulpen";
            default: return "Tidak Diketahui";
        }
    }

    public static int getHargaBarang(String kode) {
        switch (kode) {
            case "a001": return 3000;
            case "a002": return 4000;
            case "a003": return 5000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("TOKO SERBA ADA");
            System.out.println("***************");

            // Jumlah barang yang dibeli
            System.out.print("Masukan Item Barang: ");
            int itemCount = input.nextInt();
            input.nextLine(); 
            
            // Array untuk menyimpan data barang
            String[] kodeBarang = new String[itemCount];
            int[] jumlahBeli = new int[itemCount];
            int[] hargaBarang = new int[itemCount];
            String[] namaBarang = new String[itemCount];
            int[] jumlahBayar = new int[itemCount];

            // Sesi input dari pengguna
            for (int i = 0; i < itemCount; i++) {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukan Kode: ");
                kodeBarang[i] = input.nextLine();
                System.out.print("Masukan Jumlah Beli: ");
                jumlahBeli[i] = input.nextInt();
                input.nextLine(); 

                // Determinan Barang dan Harga
                namaBarang[i] = getNamaBarang(kodeBarang[i]);
                hargaBarang[i] = getHargaBarang(kodeBarang[i]);
                jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
            }

            // Hasil Output
            System.out.println("\nTOKO SERBA ADA");
            System.out.println("***************");
            System.out.println("No  Kode Barang    Nama Barang   Harga  Jumlah Beli   Jumlah Bayar");
            System.out.println("===================================================================");

            int totalBayar = 0;

            for (int i = 0; i < itemCount; i++) {
                System.out.printf("%-3d %-12s %-17s %-9d %-12d %-13d\n",
                        (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
                totalBayar += jumlahBayar[i];
            }

            System.out.println("===================================================================");
            System.out.printf("Total Bayar: %46d\n", totalBayar);
            System.out.println("===================================================================");
        } 
    }
}
