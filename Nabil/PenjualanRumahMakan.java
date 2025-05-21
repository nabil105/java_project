package com.belajar;

import java.util.Scanner;

public class PenjualanRumahMakan {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Scanner = new Scanner(System.in);

        // Menentukan menu dan harga
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Sate Ayam", "Sate Kambing", "Gado-Gado", "Es Teler", "Kopi",
                "Teh", "Jus Jeruk", "Jus Apel" };
        int[] harga = { 15000, 12000, 20000, 25000, 10000, 8000, 5000, 4000, 6000, 7000 };

        // Menentukan jumlah uang yang dipunyai
        int uang = 10000000;

        // Menampilkan menu dan harga
        System.out.println("Menu dan Harga:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        // Membeli menu
        System.out.print("Masukkan nomor menu yang ingin dibeli: ");
        int nomorMenu = Scanner.nextInt() - 1;

        // Membayar menu
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int bayar = Scanner.nextInt();

        // Menghitung kembalian
        int kembalian = bayar - harga[nomorMenu];

        // Menampilkan hasil
        System.out.println("Menu yang dibeli: " + menu[nomorMenu]);
        System.out.println("Harga: Rp " + harga[nomorMenu]);
        System.out.println("Bayar: Rp " + bayar);
        System.out.println("Kembalian: Rp " + kembalian);

        // Mengupdate jumlah uang yang dipunyai
        uang -= harga[nomorMenu];
        System.out.println("Jumlah uang yang dipunyai sekarang: Rp " + uang);
    }
}
