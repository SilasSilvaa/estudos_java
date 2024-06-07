package utilityClasses.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher5 {
    public static void main(String[] args) {
        // Meta Characters

        // \d = All digits - \D = All characters without digits
        // \s = All blank space \t \n \f \r
        // \S = All characters without blank space
        // \w = a-zA-Z, digits, underscore
        // \W = Everything not contained in \w
        // [] = Range
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = uma ou mais
        // {n,m} = n to m
        // () = group
        // | = ou
        // $ = end
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com 123abs@gmail.com, #@!abc@mail.br, teste@gmail.com.br test@mail";

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
