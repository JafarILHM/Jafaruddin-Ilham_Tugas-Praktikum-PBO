package Pertemuan3;

public class KonversiSuhu2 extends KonversiSuhu {
    @Override
    public double celciusToFahrenheit(double celcius) {
        System.out.println("Ini adalah method dari KonversiSuhu2");
        return (celcius * 9 / 5) + 32;
    }

    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5 / 9; 
        return celciusToReamur(celcius); 
    }
}
