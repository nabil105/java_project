package com.belajar;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        int angkaRahasia = random.nextInt(100) + 1;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int percobaan = 0;

        System.out.println("Tebak angka antara 1-100!");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            int tebakan = scanner.nextInt();
            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu rendah!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu tinggi!");
            } else {
                System.out.println("Benar! Anda menebak dalam " + percobaan + " percobaan.");
                break;
            }
        }
    }
}