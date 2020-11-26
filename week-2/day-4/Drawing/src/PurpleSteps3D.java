import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    static int WIDTH = 320;
    static int HEIGHT = 320;
    final static Color PURPLE = new Color(152, 0, 153);

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
        int x = 0;
        int y = 0;
        int size = 10;
        for (int i = 1; i <= 6; i++) {
            graphics.setColor(PURPLE);
            graphics.fillRect(x, y, size, size);
            x += size;
            y += size;
            size = (int) (size*1.50);


        }

    }
    //public static void filledRect(Graphics graphics, int x, int y, int size) {
    //       graphics.setColor(Color.black);
    //        graphics.fillRect(11+x, 11+y, size, size);
    //
    //          graphics.setColor(PURPLE);
    //            graphics.fillRect(10+x, 10+y, size, size);

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