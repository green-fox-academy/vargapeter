import javax.swing.*;

import java.awt.*;
import java.util.Random;
import javax.swing.Timer;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {
    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 100; i++) {
            graphics.setColor(getRandomColor());
            graphics.fill3DRect(getRandom(500), getRandom(500), getRandom(500), getRandom(500),true);
        }
    }

    private static int getRandom(int max) {
        Random rand = new Random();
        int n = rand.nextInt(max);
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
            repaint(1000);
        }
    }
}