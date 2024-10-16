package Pertemuan6;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimum 10): ");
        int n = scanner.nextInt();
        
        if (n > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
        } else {
            System.out.print("\t");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t"); 
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t"); 
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
