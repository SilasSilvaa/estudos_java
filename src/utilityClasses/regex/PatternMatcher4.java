package utilityClasses.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher4 {
    public static void main(String[] args) {
        // Meta Characters

        // \d = All digits - \D = All characters without digits
        // \s = All blank space \t \n \f \r
        // \S = All characters without blank space
        // \w = a-AZ-Z, digits, underscore
        // \W = Everything not contained in \w
        // [] = Range
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = uma ou mais
        // {n,m} = n to m
        // () = group
        // | = ou
        // $ = end

        String regex = "0[xX]([\\dA-Fa-f])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

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
