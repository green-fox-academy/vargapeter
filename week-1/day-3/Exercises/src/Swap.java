public class Swap {
    public static void main(String[] args) {

        int temp = 0;
        int a = 123;
        int b = 526;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
