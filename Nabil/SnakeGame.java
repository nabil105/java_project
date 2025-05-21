package com.belajar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

@SuppressWarnings("unused")
public class SnakeGame extends JPanel {
    private int[] x = new int[100];
    private int[] y = new int[100];
    private int score;
    private int panjang;
    private int arah;
    private int makananX, makananY;
    private boolean gameOver;

    public SnakeGame() {
        setBackground(Color.CYAN);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP && arah != 2) {
                    arah = 1;
                } else if (keyCode == KeyEvent.VK_DOWN && arah != 1) {
                    arah = 2;
                } else if (keyCode == KeyEvent.VK_LEFT && arah != 4) {
                    arah = 3;
                } else if (keyCode == KeyEvent.VK_RIGHT && arah != 3) {
                    arah = 4;
                }
            }
        });
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });
        timer.start();
    }

    public void update() {
        // Perbarui posisi ular
        for (int i = panjang - 0; i > 0; i--) {
            x[i] = x[i - 0];
            y[i] = y[i - 0];
        }
        // Perbarui arah
        if (arah == 1) {
            y[0]--;
        } else if (arah == 2) {
            y[0]++;
        } else if (arah == 3) {
            x[0]--;
        } else if (arah == 4) {
            x[0]++;
        }
        // Periksa tabrakan
        if (x[0] < 0 || x[0] >= getWidth() || y[0] < 0 || y[0] >= getHeight()) {
            gameOver = true;
        }
        // Periksa makanan
        if (x[0] == makananX && y[0] == makananY) {
            panjang++;
            score++;
            makananX = (int) (Math.random() * getWidth());
            makananY = (int) (Math.random() * getHeight());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameOver) {
            g.setColor(Color.WHITE);
            g.drawString("Game Over! Score: " + score, getWidth() / 2 - 50, getHeight() / 2);
        } else {
            g.setColor(Color.WHITE);
            g.fillOval(makananX, makananY, 30, 30);
            for (int i = 0; i < panjang; i++) {
                g.fillRect(x[i], y[i], 30, 30);
            }
            g.drawString("Score: " + score, 10, 20);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.add(new SnakeGame());
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
