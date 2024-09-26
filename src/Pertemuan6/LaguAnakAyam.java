package Pertemuan6;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Lagu Anak Ayam Turun " + n);
        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
    }
}
