import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = in.nextLine();
        in.close();
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Your name is " + name + "!");
    }
}