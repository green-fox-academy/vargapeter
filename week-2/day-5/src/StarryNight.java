import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        for (int i = 0; i < 1000; i++) {
            drawRect(graphics, getRandom(), getRandom());
        }
        for (int i = 0; i < 4000; i++) {
            drawColoredRect(graphics, getRandom(), getRandom());
        }

    }

    private static void drawRect(Graphics graphics, int x, int y) {
        graphics.setColor(getRandomShade());
        graphics.drawRect(x, y, 1, 1);
    }
    private static void drawColoredRect(Graphics graphics, int x, int y) {
        graphics.setColor(getRandomColor());
        graphics.drawRect(x, y, 1, 1);
    }

    private static int getRandom() {
        Random rand = new Random();
        int n = rand.nextInt(640);
        n += 1;
        return n;
    }

    private static Color getRandomShade() {
        Random rand = new Random();
        float l = rand.nextFloat()*0.8f+0.2f;
        return new Color(l, l, l);
    }

    private static Color getRandomColor() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r, g, b);
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.black);
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
            repaint();
        }
    }
}