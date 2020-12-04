import java.util.Collections;
import java.util.List;

public class fibonacci {
    static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fibonacci(n-1));
    }
}