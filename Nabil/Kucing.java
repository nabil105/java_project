package com.belajar;

public class Kucing extends Mamalia {
    public static void main(String[] args) {
        //binatang b = new binatang();
        Mamalia m = new Mamalia();
        Kucing k = new Kucing();

        System.out.println(m instanceof binatang);
        System.out.println(m instanceof Mamalia);
        System.out.println(m instanceof binatang);
    }

}
