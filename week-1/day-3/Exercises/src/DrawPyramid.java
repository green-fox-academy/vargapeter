import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many lines ?: ");
        int max = scan.nextInt();

        scan.close();

        for (int i = 1; i <= max; i++) {
            int c=i+(i-1);
            int mc=max+(max-1);
            int space=(mc-c)/2;

            for (int j =1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j =1; j <= c; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }




    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
}
