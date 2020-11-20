import java.util.Scanner;

public class MileToKmConverter {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("How many miles?: ");

            double L = scan.nextInt();
            scan.close();

            System.out.println("Miles in Km: " + (L/5*8) );
            
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}
