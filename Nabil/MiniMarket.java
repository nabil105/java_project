package com.belajar;

import java.util.Scanner;

public class MiniMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar barang dan harga
        String[] namaBarang = { "Aquafresh", "Indomie", "Kopi Good Day", "Roti Tawar", "Telur" };
        int[] hargaBarang = { 5000, 2500, 2000, 1500, 1000 };
        int[] stokBarang = { 100, 200, 150, 300, 250 };

        // Jumlah duit yang di punyai
        int uang = 100000000;

        System.out.println("Selamat Datang di Mini Market!");
        System.out.println("Daftar Barang:");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println(
                    (i + 1) + ". " + namaBarang[i] + " - Rp " + hargaBarang[i] + " (Stok: " + stokBarang[i] + ")");
        }

        System.out.print("Masukkan nomor barang yang ingin dibeli: ");
        int nomorBarang = scanner.nextInt() - 1;

        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Cek stok barang
        if (stokBarang[nomorBarang] < jumlahBarang) {
            System.out.println("Maaf, stok barang tidak cukup.");
            return;
        }

        int totalHarga = hargaBarang[nomorBarang] * jumlahBarang;

        // Cek uang yang di punyai
        if (uang < totalHarga) {
            System.out.println("Maaf, uang yang di punyai tidak cukup.");
            return;
        }

        // Kurangi stok barang
        stokBarang[nomorBarang] -= jumlahBarang;

        // Kurangi uang yang di punyai
        uang -= totalHarga;

        // Hitung kembalian
        int kembalian = 0;
        if (uang > 0) {
            kembalian = uang;
            uang = 0;
        }

        System.out.println("\nRincian Penjualan:");
        System.out.println("Nama Barang: " + namaBarang[nomorBarang]);
        System.out.println("Harga Barang: Rp " + hargaBarang[nomorBarang]);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Kembalian: Rp " + kembalian);
        System.out.println("Uang yang di punyai sekarang: Rp " + uang);

        scanner.close();
    }
}