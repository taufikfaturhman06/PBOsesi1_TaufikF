package Tugas1;

import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konversi Suhu ===");
        System.out.print("Masukkan suhu dalam Reamur: ");
        double suhuReamur = scanner.nextDouble();

        double suhuCelcius = (5.0 / 4.0) * suhuReamur;
        double suhuFahrenheit = (9.0 / 4.0) * suhuReamur + 32;
        double suhuKelvin = (5.0 / 4.0) * suhuReamur + 273.15;

        System.out.println("Hasil Konversi:");
        System.out.println("Celcius: " + suhuCelcius + " °C");
        System.out.println("Fahrenheit: " + suhuFahrenheit + " °F");
        System.out.println("Kelvin: " + suhuKelvin + " K");

        scanner.close();
    }
}