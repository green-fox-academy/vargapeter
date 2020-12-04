import java.util.Collections;
import java.util.List;

public class bunniesAgain {
    static int earCounter(int numberOfBunnies, int ears)
    {
        if (numberOfBunnies == 1)
            return ears;
        return earCounter(numberOfBunnies-1, 2)*ears;
    }

    public static void main (String args[])
    {

        int numberOfBunnies = 20;
        int ears = 2;
        System.out.println(earCounter(ears, numberOfBunnies));
    }
}