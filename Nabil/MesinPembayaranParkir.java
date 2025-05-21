package com.belajar;

import java.util.Scanner;

public class MesinPembayaranParkir {
    public static void main(String[] args) {
        // Buat objek Scanner untuk meminta input dari pengguna
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan biaya parkir
        int biayaParkir = 5000;

        // Variabel untuk menyimpan jumlah uang yang dimasukkan pengguna
        int jumlahUang = 0;

        // Variabel untuk menyimpan kembalian
        int kembalian = 0;

        // Tampilkan informasi biaya parkir
        System.out.println("Biaya parkir: Rp " + biayaParkir);

        // Minta pengguna untuk memasukkan jumlah uang
        System.out.print("Masukkan jumlah uang: Rp ");
        jumlahUang = scanner.nextInt();

        // Periksa apakah jumlah uang yang dimasukkan cukup untuk membayar biaya parkir
        if (jumlahUang < biayaParkir) {
            System.out.println("Jumlah uang yang dimasukkan tidak cukup untuk membayar biaya parkir.");
        } else {
            // Hitung kembalian
            kembalian = jumlahUang - biayaParkir;

            // Tampilkan informasi pembayaran
            System.out.println("Pembayaran berhasil!");
            System.out.println("Kembalian: Rp " + kembalian);
        }
    }
}
