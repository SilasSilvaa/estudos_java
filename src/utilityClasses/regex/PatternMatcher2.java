package utilityClasses.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher2 {
    public static void main(String[] args) {
        // Meta Characters

        // \d = All digits - \D = All characters without digits
        // \s = All blank space \t \n \f \r
        // \S = All characters without blank space
        // \w = a-AZ-Z, digits, underscore
        // \W = Everything not contained in \w
        String regex = "\\W";

        String text = "@#12_sad 9af ad7a9da2 3";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:    " + text);
        System.out.println("Indices: " + "0123456");
        System.out.println("regex: " + regex);
        System.out.println("---------");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
