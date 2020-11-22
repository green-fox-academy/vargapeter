import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two numbers: ");


        int numA = scan.nextInt();
        int numB = scan.nextInt();
        scan.close();

        if (numA >= numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }

    }
}