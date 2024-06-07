package utilityClasses.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher3 {
    public static void main(String[] args) {
        // Meta Characters

        // \d = All digits - \D = All characters without digits
        // \s = All blank space \t \n \f \r
        // \S = All characters without blank space
        // \w = a-AZ-Z, digits, underscore
        // \W = Everything not contained in \w
        // [] = Range
        String text = "@#12_sad 9af ad7a9da2 3";
        String regex = "\\W";
        String regexHex = "0[xX][\\dA-Fa-f]";
        String numberHex = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regexHex);
        Matcher matcher = pattern.matcher(numberHex);

        System.out.println("Text:    " + text);
        System.out.println("Indices: " + "0123456");
        System.out.println("regex: " + regex);
        System.out.println("---------");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        System.out.println("---------");

    }
}
