import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        System.out.println("Give me five numbers: ");
        for (int i = 0; i<5; i++){
            int number = scan.nextInt();
            sum = sum + number;

        }
        System.out.println("Sum: " + sum + ", Average: " + (double)sum/5);
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

    }
}
