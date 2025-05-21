package com.belajar;

public class bangunan {
    private String nama;
    private double panjang;
    private double lebar;

    public bangunan(String nama, double panjang, double lebar) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public String getNama() {
        return nama;
    }
}

ruangan.java

public class ruangan extends bangunan {
    private double tinggi;

    public ruangan(String nama, double panjang, double lebar, double tinggi) {
        super(nama, panjang, lebar);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }
}

Main.java

public class Main {
    public static void main(String[] args) {
        bangunan bangunan = new bangunan("Gedung Utama", 20, 30);
        ruangan ruangan = new ruangan("Ruang Kelas", 10, 15, 3);

        System.out.println("Luas " + bangunan.getNama() + ": " + bangunan.hitungLuas() + " m^2");
        System.out.println("Luas " + ruangan.getNama() + ": " + ruangan.hitungLuas() + " m^2");
        System.out.println("Volume " + ruangan.getNama() + ": " + ruangan.hitungVolume() + " m^3");
    }
}
