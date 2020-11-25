import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {

    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.
        Scanner scan = new Scanner(System.in);

        System.out.println("First line starting coordinates, first X than Y?");
        int xCorFirst = scan.nextInt();
        int yCorFirst = scan.nextInt();

        System.out.println("Second line starting coordinates, first X than Y?");
        int xCorSecond = scan.nextInt();
        int yCorSecond = scan.nextInt();

        System.out.println("Second line starting coordinates, first X than Y?");
        int xCorThird= scan.nextInt();
        int yCorThird = scan.nextInt();

        scan.close();

        graphics.setColor(Color.green);
        graphics.drawLine(xCorFirst, yCorFirst, 360, 360);

        graphics.setColor(Color.blue);
        graphics.drawLine(xCorSecond, yCorSecond, 360, 360);

        graphics.setColor(Color.red);
        graphics.drawLine(xCorThird, yCorThird, 360, 360);

    }

    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

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