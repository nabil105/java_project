package com.belajar_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SpaceInvaders extends JPanel implements KeyListener {
    private int shipX = 200;
    private int shipY = 400;
    private int[] alienX = new int[10];
    private int[] alienY = new int[10];
    private int[] alienSpeed = new int[10];
    private int score;
    private int lives;
    private boolean gameOver;
    private Timer timer;
    private Random random;
    private boolean shoot;
    private int bulletX;
    private int bulletY;

    public SpaceInvaders() {
        setPreferredsize(new Dimension(400, 500));
        setBackground(Color.BLACK);
        setFocusabel(true);
        requestFocus();
        addKeyListener(this);

        random = new Random();
        scroe = 0;
        lives = 3
        gameOver = false;
        shoot = false;

        for (int i = 0; i < 10; i ++) {
            alienX[i] = random.nextInt(350);
            alienY[i] = random.nextInt(200);
            alienSpeed[i] = random.nextInt(3) + 1;
        }

        timer = new Timer(1000 / 60, new ActionListener()){
            public void actionPerformed(AcionEvent event) {
                if (!gameOver) {
                    moveAliens();
                    moveBullets();
                    checkCollisions();
                    repaint();
                } else {
                    timer.stop();
                }
            
            }
        });
        timer.start();
    }

}

    private void moveAliens() {
        for (int i = 0; i < 10; i++) {
            alienX[i] += alienSpeed[i];
            if (alienX[i] > 350 || alienSpeed[i] < 0) {
                alienSpeed[i] = -alienSpeed[i];
                alienY[i] += 20;
            }
        }
    }

    private void moveBullet() {
        if (shoot) {
            bulletY -= 10;
            if (bulletY < 0) {
                shoot = false;
            }
        }
    }

    private void checkCollisions() {
        for (int i = 0; i < 10; i++) {
            if (Math.abs(alienX[i] - shipX) < 20 && Math.abs(alienY[i] - shipY) < 20) {
                lives--;
                if (lives == 0) {
                    gameOver = true;
                }
            }
            if (shoot && Math.abs(alienX[i] - bulletX) < 20 && Math.abs(alienY[i] - bulletY) < 20) {
                score++;
                alienX[i] = random.nextInt(350);
                alienY[i] = random.nextInt(200);
                shoot = false;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);

        // Draw ship
        g.fillRect(shipX, shipY, 20, 20);

        // Draw aliens
        for (int i = 0; i < 10; i++) {
            g.fillRect(alienX[i], alienY[i], 20, 20);
        }

        // Draw bullet
        if (shoot) {
            g.fillRect(bulletX, bulletY, 5, 10);
        }

        // Draw score and lives
        g.drawString("Score: " + score, 10, 20);
        g.drawString("Lives: " + lives, 10, 40);

        // Draw game over message
        if (gameOver) {
            g.drawString("GameOver !", 150, 250);
        }
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                shipX -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                shipX += 10;
                break;
            case KeyEvent.VK_SPACE:
                if (!shoot) {
                    bulletX = shipX + 7;
                    bulletY = shipY;
                    shoot = true;
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

public static void main(String[] args) {
    JFrame frame = new JFrame("Space Invaders");
    frame.setDefaultCloserOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new  SpaceInvaders());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisitable(true);
}