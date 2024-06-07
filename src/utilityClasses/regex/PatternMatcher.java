package utilityClasses.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "ababaab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:    " + text);
        System.out.println("Indices: " + "0123456");
        System.out.println("regex: " + regex);
        System.out.println("---------");

        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
