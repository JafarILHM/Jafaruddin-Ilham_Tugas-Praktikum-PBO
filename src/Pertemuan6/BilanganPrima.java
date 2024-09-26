package Pertemuan6;

public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 - 20:");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i) && i > 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
