package Pertemuan3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu konversi1 = new KonversiSuhu();
        System.out.println("Konversi dengan object KonversiSuhu:");
        System.out.println("25 Celcius ke Fahrenheit (double): " + konversi1.celciusToFahrenheit(25.0));
        System.out.println("25 Celcius ke Fahrenheit (int): " + konversi1.celciusToFahrenheit(25));
        System.out.println("25 Celcius ke Reamur: " + konversi1.celciusToReamur(25));
       
        KonversiSuhu2 konversi2 = new KonversiSuhu2();
        System.out.println("\nKonversi dengan object KonversiSuhu2:");
        System.out.println("25 Celcius ke Fahrenheit (double, overridden): " + konversi2.celciusToFahrenheit(25.0));
        System.out.println("77 Fahrenheit ke Reamur: " + konversi2.fahrenheitToReamur(77)); 
    }
}
