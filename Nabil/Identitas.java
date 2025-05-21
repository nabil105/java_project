package com.belajar;

public class Identitas {
    public static void main(String[] args) {

    }

    private String nama;
    private int umur;
    private String jenisKelamin;
    private String alamat;
    private String asalSekolah;
    private String hobi;
    private String citaCita;

    public Identitas() {
    }

    public void setIsiIdentitas(String nama, int umur, String jenisKelamin, String alamat, String asalSekolah,
            String hobi, String citaCita) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.asalSekolah = asalSekolah;
        this.hobi = hobi;
        this.citaCita = citaCita;
    }

    public void tampilkanIdentitas() {
        System.out.println("Identitas Seseorang");
        System.out.println("---------------------");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Hobi: " + hobi);
        System.out.println("Cita-Cita: " + citaCita);
    }
}
