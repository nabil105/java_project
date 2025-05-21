package com.belajar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PenghancurAsteroid extends JPanel implements KeyListener {

    private final int LEBAR = 800;
    private final int TINGGI = 600;
    private final int UKURAN_PESAWAT = 20;

    private int xPesawat = 100;
    private int yPesawat = 100;
    private int kecepatanPesawat = 5;

    private int[] xAsteroid = new int[10];
    private int[] yAsteroid = new int[10];
    private int jumlahAsteroid = 0;

    private Random random = new Random();

    public PenghancurAsteroid() {
        setPreferredSize(new Dimension(LEBAR, TINGGI));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        buatAsteroid();
        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerakPesawat();
                periksaTabrakan();
                repaint();
            }
        });
        timer.start();
    }

    private void buatAsteroid() {
        for (int i = 0; i < 10; i++) {
            xAsteroid[i] = random.nextInt(LEBAR);
            yAsteroid[i] = random.nextInt(TINGGI);
        }
    }

    private void gerakPesawat() {
        if (KeyEvent.getKeyText(KeyEvent.VK_LEFT).equals("Kiri")) {
            xPesawat -= kecepatanPesawat;
        } else if (KeyEvent.getKeyText(KeyEvent.VK_RIGHT).equals("Kanan")) {
            xPesawat += kecepatanPesawat;
        } else if (KeyEvent.getKeyText(KeyEvent.VK_UP).equals("Atas")) {
            yPesawat -= kecepatanPesawat;
        } else if (KeyEvent.getKeyText(KeyEvent.VK_DOWN).equals("Bawah")) {
            yPesawat += kecepatanPesawat;
        }
    }

    private void periksaTabrakan() {
        for (int i = 0; i < jumlahAsteroid; i++) {
            if (xPesawat + UKURAN_PESAWAT > xAsteroid[i] &&
                    xPesawat < xAsteroid[i] + UKURAN_PESAWAT &&
                    yPesawat + UKURAN_PESAWAT > yAsteroid[i] &&
                    yPesawat < yAsteroid[i] + UKURAN_PESAWAT) {
                JOptionPane.showMessageDialog(null, "Game Over!");
                System.exit(0);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(xPesawat, yPesawat, UKURAN_PESAWAT, UKURAN_PESAWAT);

        g.setColor(Color.RED);
        for (int i = 0; i < jumlahAsteroid; i++) {
            g.fillRect(xAsteroid[i], yAsteroid[i], UKURAN_PESAWAT, UKURAN_PESAWAT);
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
        JFrame frame = new JFrame("Penghancur Asteroid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PenghancurAsteroid());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
