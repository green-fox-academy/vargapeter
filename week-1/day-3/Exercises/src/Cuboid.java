import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lengths of the cuboid: ");
        int L = scan.nextInt();
        System.out.println("Broadth of the cuboid: ");
        int B = scan.nextInt();
        System.out.println("Height of the cuboid: ");
        int H = scan.nextInt();
        scan.close();
        System.out.println("Surface area " + (2*(L*B+B*H+H*L)));
        System.out.println("Volume " + (L*B*H));
    }
}
