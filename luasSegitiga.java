package Tugas1;

import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hitung Luas Segitiga ===");
        
        System.out.print("Masukan panjang alas segitiga : ");
        double alas = scanner.nextDouble();

        System.out.print("Masukan tinggi segitiga : ");
        double tinggi = scanner.nextDouble();

        double luas = alas * tinggi /2;

        System.out.println("Luas segita dengan alas = " + alas + " cm dan tinggi = " + tinggi + " cm adalah : " + luas + " cm");

        scanner.close();
    }
}
