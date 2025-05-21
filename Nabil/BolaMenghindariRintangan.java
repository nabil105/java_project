package com.belajar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BolaMenghindariRintangan extends JPanel implements KeyListener {

    private final int LEBAR = 800;
    private final int TINGGI = 600;
    private final int UKURAN_BOLA = 20;

    private int xBola = 100;
    private int yBola = 100;
    private int kecepatanBola = 5;

    private int[] xRintangan = new int[10];
    private int[] yRintangan = new int[10];
    private int jumlahRintangan = 0;

    private Random random = new Random();

    public BolaMenghindariRintangan() {
        setPreferredSize(new Dimension(LEBAR, TINGGI));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        buatRintangan();
        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerakBola();
                periksaTabrakan();
                repaint();
            }
        });
        timer.start();
    }

    private void buatRintangan() {
        for (int i = 0; i < 10; i++) {
            xRintangan[i] = random.nextInt(LEBAR);
            yRintangan[i] = random.nextInt(TINGGI);
        }
    }

    private void gerakBola() {
        xBola += kecepatanBola;
        if (xBola > LEBAR) {
            xBola = 0;
        }
    }

    private void periksaTabrakan() {
        for (int i = 0; i < jumlahRintangan; i++) {
            if (xBola + UKURAN_BOLA > xRintangan[i] &&
                    xBola < xRintangan[i] + UKURAN_BOLA &&
                    yBola + UKURAN_BOLA > yRintangan[i] &&
                    yBola < yRintangan[i] + UKURAN_BOLA) {
                JOptionPane.showMessageDialog(null, "Game Over!");
                System.exit(0);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillOval(xBola, yBola, UKURAN_BOLA, UKURAN_BOLA);

        g.setColor(Color.RED);
        for (int i = 0; i < jumlahRintangan; i++) {
            g.fillRect(xRintangan[i], yRintangan[i], UKURAN_BOLA, UKURAN_BOLA);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bola Menghindari Rintangan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BolaMenghindariRintangan());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
