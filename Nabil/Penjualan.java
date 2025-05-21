import java.util.Scanner;

public class Penjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga barang (Rp): ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan diskon (%): ");
        double diskon = scanner.nextDouble();

        double subtotal = harga * jumlah;
        double potonganDiskon = subtotal * (diskon / 100);
        double totalBayar = subtotal - potonganDiskon;

        System.out.println("\nStruk Penjualan");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: Rp " + harga);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Subtotal: Rp " + subtotal);
        System.out.println("Diskon (" + diskon + "%): Rp " + potonganDiskon);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}