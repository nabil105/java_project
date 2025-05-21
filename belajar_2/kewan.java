package com.belajar_2;

class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

// Kelas Anak 1
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing: Meong!");
    }
}

// Kelas Anak 2
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing: Guk guk!");
    }
}

// Kelas Utama
public class kewan {
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        Hewan h2 = new Kucing();
        Hewan h3 = new Anjing();

        h1.suara(); // Output: Hewan mengeluarkan suara
        h2.suara(); // Output: Kucing: Meong!
        h3.suara(); // Output: Anjing: Guk guk!
    }
}