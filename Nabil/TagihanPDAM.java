package com.belajar;

import java.util.Scanner;

public class TagihanPDAM {
    private String namaPelanggan;
    private int jumlahPemakaian;
    private double tarifPerMeter;
    private double totalTagihan;

    public TagihanPDAM() {
        namaPelanggan = "";
        jumlahPemakaian = 0;
        tarifPerMeter = 0.0;
        totalTagihan = 0.0;
    }

    public void inputPelanggan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan jumlah pemakaian (meter): ");
        jumlahPemakaian = scanner.nextInt();
        System.out.print("Masukkan tarif per meter (Rp): ");
        tarifPerMeter = scanner.nextDouble();
    }

    public void hitungTagihan() {
        totalTagihan = jumlahPemakaian * tarifPerMeter;
    }

    public void tampilkanTagihan() {
        System.out.println("Tagihan PDAM:");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jumlah Pemakaian: " + jumlahPemakaian + " meter");
        System.out.println("Tarif per Meter: Rp " + tarifPerMeter);
        System.out.println("Total Tagihan: Rp " + totalTagihan);
    }

    public static void main(String[] args) {
        TagihanPDAM tagihanPDAM = new TagihanPDAM();
        tagihanPDAM.inputPelanggan();
        tagihanPDAM.hitungTagihan();
        tagihanPDAM.tampilkanTagihan();
    }
}
