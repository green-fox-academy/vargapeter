package com.greenfox.example.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

@Service
@AllArgsConstructor
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean isValid(String email) {
        boolean isValid = Pattern.matches("^[a-z-0-9-]+@[a-z][a-z-0-9-]+(\\.[a-z-0-9-]+)+$", email);
        return isValid;
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;

    }


}