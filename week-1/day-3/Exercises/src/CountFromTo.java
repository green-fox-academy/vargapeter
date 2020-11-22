import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int FirstNum = scan.nextInt();

        System.out.println("Give me another number: ");
        int SecondNum = scan.nextInt();

        if ( SecondNum > FirstNum);
        System.out.println("The second number should be bigger");

        //else();


        scan.close();
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
    }
}
