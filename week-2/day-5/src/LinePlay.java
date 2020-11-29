import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i <= WIDTH / 20; i++) {
//            drawLine(graphics, 0 + i * 20, 0);
//            drawLine(graphics, WIDTH, i * 20);
//            drawLine(graphics, WIDTH - i * 20, HEIGHT);
//            drawLine(graphics, 0, HEIGHT - i * 20);
            graphics.drawLine(0 + i * 20, 0, WIDTH, i * 20);

        }

    }

    private static void drawLine(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }

    private static int getRandom() {
        Random rand = new Random();
        int n = rand.nextInt(320);
        n += 1;
        return n;
    }

    private static Color getRandomColor() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r, g, b);
    }

    // Don't touch the code below
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