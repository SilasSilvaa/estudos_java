package utilityClasses.regex;

import java.util.Scanner;

public class ScannerDelimiters {
    public static void main(String[] args) {
        String text = "Name1,Name2,Name3,true,200";
        Scanner scanner = new Scanner(text).useDelimiter(",");

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println(i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            }else {
                System.out.println(scanner.next());
            }
        }

    }
}
