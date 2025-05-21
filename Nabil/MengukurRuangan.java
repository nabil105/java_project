import java.util.Scanner;

public class MengukurRuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (m): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar ruangan (m): ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi ruangan (m): ");
        double tinggi = scanner.nextDouble();

        double luas = hitungLuas(panjang, lebar);
        double volume = hitungVolume(panjang, lebar, tinggi);

        System.out.println("Luas ruangan: " + luas + " m^2");
        System.out.println("Volume ruangan: " + volume + " m^3");
    }

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
}
