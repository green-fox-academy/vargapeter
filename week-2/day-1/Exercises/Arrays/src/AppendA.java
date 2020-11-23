import java.util.Arrays;

public class AppendA {
    // - Create an array variable named `animals`
    //   with the following content: `["koal", "pand", "zebr"]`
    // - Add all elements an `"a"` at the end
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        animals[0] = animals[0] + "a";
        animals[1] = animals[1] + "a";
        animals[2] = animals[2] + "a";

        System.out.print(Arrays.toString(animals));

    }
}
