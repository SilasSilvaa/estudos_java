package utilityClasses.date;

import exercise.models.Local;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Date
        Date date = new Date(1717033437103L); //long
        System.out.println(date);

        System.out.println("-----------------------------");

        //Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo");
        }

        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

//        calendar.add(Calendar.DAY_OF_WEEK, 2);
//        calendar.roll(Calendar.HOUR, 12);
        Date currentDate = calendar.getTime();
        System.out.println(currentDate);

        System.out.println("-----------------------------");

        // Date Format
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[1] = DateFormat.getInstance();
        df[0] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormated : df){
            System.out.println(dateFormated.format(calendar.getTime()));
        }
        System.out.println("-----------------------------");

        // Locale
        Locale localeItaly = new Locale("it", "IT");
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        System.out.println(dateInstance.format(calendar.getTime()));

        System.out.println(localeItaly.getCountry());

        System.out.println("-----------------------------");

        // Locale Iso
        System.out.println(Locale.getDefault());
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }

        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
        System.out.println("-----------------------------");

        // Date Time Formatter
        LocalDate date1 = LocalDate.now();
        String s1 = date1.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date1.format(DateTimeFormatter.ISO_DATE);
        String s3 = date1.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("--------");

        LocalDate p1 = LocalDate.parse("20240531", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate p2 = LocalDate.parse("2024-05-31", DateTimeFormatter.ISO_DATE);
        LocalDate p3 = LocalDate.parse("2024-05-31", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("--------");

        DateTimeFormatter patterUS = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date1.format(patterUS));
        System.out.println(LocalDate.parse("05/31/2024", patterUS));

        DateTimeFormatter patternGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        System.out.println(date1.format(patternGR));

    }
}
