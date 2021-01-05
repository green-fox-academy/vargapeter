import java.sql.DatabaseMetaData;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class JavaStreamAPI {
    public static void main(String[] args) {
////The example below shows how to select the elements of a list which are larger than 3.
//        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        myList.stream().filter(x -> x > 3).forEach(System.out::println);

////Write a Stream Expression to get the even numbers from the following list:
//        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

////Write a Stream Expression to get the squared value of the positive numbers from the following list:
//        List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//        numbers2.stream().filter(x -> x > 0).map(x -> x * x).forEach(System.out::println);

////Write a Stream Expression to find which number squared value is more then 20 from the following list:
//        List<Integer> numbers3 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//        numbers3.stream()
//                .map(x -> x * x)
//                .filter (x -> x > 20)
//                .forEach(System.out::println);

////Write a Stream Expression to get the average value of the odd numbers from the following list:
//        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//        OptionalDouble average = numbers4.stream()
//                .filter(x -> x % 2 == 0)
//                .mapToInt(x -> x).average();
//
//                if (average.isPresent()) {
//                    System.out.println(average.getAsDouble());
//                } else {
//                    System.out.println("error");
//                }

////Write a Stream Expression to get the sum of the odd numbers in the following list:
//        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
//        int sumofOdd = numbers5.stream()
//                .filter(x -> x % 2 != 0)
//                .mapToInt(x -> x).sum();
//                System.out.println(sumofOdd);

//        //Write a Stream Expression to find the uppercase characters in a string!
//        String newString = "ThisIsMyString".chars()
//                .filter(Character::isUpperCase)
//                .mapToObj(c -> Character.toString((char)c))
//                .collect(Collectors.joining());








    }
}
