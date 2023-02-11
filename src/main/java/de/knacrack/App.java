package de.knacrack;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        String toCalculate = "4+5-20+44-3*sin2^3*2*(2+1-3)*21^1";
        System.out.println(splitCalculation(toCalculate));
    }

    private static LinkedList<String> splitCalculation(String calculation) {
        Pattern pattern = Pattern.compile("[0-9]+|(\\+|-|\\*)+|[A-Za-z]+|[!^/:]+");
        Matcher matcher = pattern.matcher(calculation);
        LinkedList<String> parts = new LinkedList<>();

        while (matcher.find()) {
            parts.add(matcher.group());
        }

        return parts;
    }
}