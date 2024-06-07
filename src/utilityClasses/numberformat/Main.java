package utilityClasses.numberformat;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[3];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeIT);

        double number = 10_000.123;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getCurrency() + " " + numberFormat.format(number));
        }

        System.out.println("-----------------------------");
        NumberFormat[] nfa2 = new NumberFormat[3];
        nfa2[0] = NumberFormat.getCurrencyInstance();
        nfa2[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa2[2] = NumberFormat.getCurrencyInstance(localeIT);

        for (NumberFormat numberFormat : nfa2){
            System.out.println(numberFormat.getCurrency() + " " + numberFormat.format(number));
        }

        System.out.println("-----------------------------");
        // Simple dateFormat
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "yyyy.MM.dd";
        String pattern3 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern3);

        System.out.println(simpleDateFormat.format(new Date()));
    }
}
