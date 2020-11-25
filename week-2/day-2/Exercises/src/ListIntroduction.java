import java.util.*;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(names.size());

        names.add("William");

        if (names.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());
        System.out.println(names.get(2));

        for (String elements : names) {
            System.out.println(elements);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        names.remove(1);

        Collections.reverse(names);
        for (String reverse : names) {
            System.out.println(reverse);
        }


    names.clear();{




