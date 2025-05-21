package com.belajar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSiswa dataSiswa = new DataSiswa();

        while (true) {
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Tampilkan Daftar Siswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    tambahSiswa(scanner, dataSiswa);
                    break;
                case 2:
                    dataSiswa.tampilkanDaftarSiswa();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahSiswa(Scanner scanner, DataSiswa dataSiswa) {
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan kelas siswa: ");
        String kelas = scanner.nextLine();

        System.out.print("Masukkan NIS siswa: ");
        String nis = scanner.nextLine();

        System.out.print("Masukkan tanggal lahir siswa (dd-mm-yyyy): ");
        String tanggalLahir = scanner.nextLine();

        System.out.print("Masukkan alamat siswa: ");
        String alamat = scanner.nextLine();

        Siswa siswa = new Siswa(nama, kelas, nis, tanggalLahir, alamat);
        dataSiswa.tambahSiswa(siswa);
    }
}
