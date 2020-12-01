import java.util.Scanner;

public class divideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
        System.out.println("fail");

        }
    }
}
