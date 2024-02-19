package Tugas1;

import java.util.Scanner;

public class hitungUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hitung Umur ===");
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        int umur = 2024 - tahunLahir;
        System.out.println("Umur Anda tahun ini adalah " + umur + " tahun.");

        scanner.close();
    }
}
