import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    static int WIDTH = 320;
    static int HEIGHT = 320;
    final static Color PURPLE = new Color(152, 0, 153);

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
        for (int i = 0; i < 19; i++) {
            filledRect(graphics, i * 10, i * 10);
        }

    }

    public static void filledRect(Graphics graphics, int x, int y) {
        graphics.setColor(Color.black);
        graphics.fillRect(10 + x, 10 + y, 11, 11);

        graphics.setColor(PURPLE);
        graphics.fillRect(10 + x, 10 + y, 10, 10);

    }

    // Don't touch the code below
    //static int WIDTH = 320;
    //static int HEIGHT = 320;

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