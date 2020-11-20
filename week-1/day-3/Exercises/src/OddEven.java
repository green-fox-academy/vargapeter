import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int num = scan.nextInt();
        scan.close();
        if ( num % 2 == 0 )
            System.out.println("Your number is even.");
        else
            System.out.println("Your number is odd.");

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
    }
}