package com.belajar;

public class latihan5 {
    public static void main(String[] args) {

    }

    public class Identitas {
        private String nama;
        private int umur;
        private String jenisKelamin;
        private String alamat;
        private String asalSekolah;
        private String hobi;
        private String citaCita;

        // Konstruktor
        public Identitas(String nama, int umur, String jenisKelamin, String alamat, String asalSekolah, String hobi,
                String citaCita) {
            this.nama = nama;
            this.umur = umur;
            this.jenisKelamin = jenisKelamin;
            this.alamat = alamat;
            this.asalSekolah = asalSekolah;
            this.hobi = hobi;
            this.citaCita = citaCita;
        }

        // Getter dan Setter
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getUmur() {
            return umur;
        }

        public void setUmur(int umur) {
            this.umur = umur;
        }

        public String getJenisKelamin() {
            return jenisKelamin;
        }

        public void setJenisKelamin(String jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getAsalSekolah() {
            return asalSekolah;
        }

        public void setAsalSekolah(String asalSekolah) {
            this.asalSekolah = asalSekolah;
        }

        public String getHobi() {
            return hobi;
        }

        public void setHobi(String hobi) {
            this.hobi = hobi;
        }

        public String getCitaCita() {
            return citaCita;
        }

        public void setCitaCita(String citaCita) {
            this.citaCita = citaCita;
        }

        // Method untuk menampilkan identitas
        public void tampilkanIdentitas() {
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.println("Alamat: " + alamat);
            System.out.println("Asal Sekolah: " + asalSekolah);
            System.out.println("Hobi: " + hobi);
            System.out.println("Cita-Cita: " + citaCita);
        }
    }
}
