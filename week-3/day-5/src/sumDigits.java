import java.util.Collections;
import java.util.List;

public class sumDigits {
    static int adder(int n)
    {
        if (n <= 0)
            return n;
        return adder(n/10)+(n%10);
    }

    public static void main (String args[])
    {
        int n = 1317;
        System.out.println(adder(n));
    }
}