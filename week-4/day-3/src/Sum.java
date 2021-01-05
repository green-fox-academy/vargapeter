import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int getSum = 0;

        for (int i : numbers)
            getSum += i;
        System.out.println(getSum);
    }
}