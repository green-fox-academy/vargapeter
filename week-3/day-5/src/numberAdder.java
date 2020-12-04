import java.util.Collections;
import java.util.List;

public class numberAdder {
    static int adder(int n)
    {
        if (n <= 0)
            return n;
        return adder(n-1)+n;
    }

    public static void main (String args[])
    {
        int n = 10;
        System.out.println(adder(n));
    }
}