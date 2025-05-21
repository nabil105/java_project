package com.belajar;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] papan = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            cetakPapan(papan);
            masukkanSimbol(papan, scanner);
            selesai = cekMenang(papan);
        }
    }

    static void cetakPapan(char[][] papan) {
        for (char[] baris : papan) {
            for (char sel : baris) {
                System.out.print(sel + " | ");
            }
            System.out.println();
        }
    }

    static void masukkanSimbol(char[][] papan, Scanner scanner) {
        System.out.print("Masukkan baris (1-3): ");
        int baris = scanner.nextInt() - 1;
        System.out.print("Masukkan kolom (1-3): ");
        int kolom = scanner.nextInt() - 1;
        papan[baris][kolom] = 'X';
    }

    static boolean cekMenang(char[][] papan) {
        // Cek baris
        for (char[] baris : papan) {
            if (baris[0] == baris[1] && baris[0] == baris[2] && baris[0] != ' ') {
                return true;
            }
        }
        // Cek kolom
        for (int i = 0; i < 3; i++) {
            if (papan[0][i] == papan[1][i] && papan[0][i] == papan[2][i] && papan[0][i] != ' ') {
                return true;
            }
        }
        // Cek diagonal
        if ((papan[0][0] == papan[1][1] && papan[0][0] == papan[2][2] && papan[0][0] != ' ') ||
                (papan[0][2] == papan[1][1] && papan[0][2] == papan[2][0] && papan[0][2] != ' ')) {
            return true;
        }
        return false;
    }
}
