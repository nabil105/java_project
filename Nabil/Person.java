package com.belajar;

public class Person {
    public static void main(String[] args) {

    }

    private String nama;
    private int umur;
    private String jenisKelamin;
    private String alamat;
    private String asalSekolah;
    private String hobi;
    private String citaCita;

    // Constructor
    public Person(String nama, int umur, String jenisKelamin, String alamat, String asalSekolah, String hobi,
            String citaCita) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.asalSekolah = asalSekolah;
        this.hobi = hobi;
        this.citaCita = citaCita;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("===== IDENTITAS DIRI =====");
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Asal Sekolah : " + asalSekolah);
        System.out.println("Hobi         : " + hobi);
        System.out.println("Cita-cita    : " + citaCita);
        System.out.println("=========================");
    }
}
