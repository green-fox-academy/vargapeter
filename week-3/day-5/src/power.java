import java.util.Collections;
import java.util.List;

public class power {
    static int power(int base, int n)
    {
        if (n == 1)
            return n;
        return power(base, n-1) * base;
    }

    public static void main (String args[])
    {
        int base = 2;
        int n = 4;
        System.out.println(power(base, n));
    }
}