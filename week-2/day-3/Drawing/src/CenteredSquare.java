import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.
        for (int i = 0; i < 200; i++) {
            int size = getRandom(Math.min(WIDTH, HEIGHT)); //a kissebbiket adja vissza

            graphics.drawRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
        }

    }

    private static int getRandom(int max) {
        Random rand = new Random();
        int n = rand.nextInt(max);
        n += 1;
        return n;
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();

    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}