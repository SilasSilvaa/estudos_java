package utilityClasses.localJava8;

import java.text.DateFormat;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Local Date
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2024, Month.MARCH, 10);
        LocalDate now = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println("-----------------------------");

        // Local Time
        LocalTime timeNow = LocalTime.now();
        LocalTime time = LocalTime.of(12, 59, 59);

        System.out.println(time);
        System.out.println(timeNow);

        System.out.println("-----------------------------");

        //Local Date Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date2 = LocalDate.parse("2024-05-30");
        LocalTime time2 = LocalTime.parse("18:05:29");

        LocalDateTime localDateTime1 = date2.atTime(time2);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = time2.atDate(date2);
        System.out.println(localDateTime2);

        System.out.println("-----------------------------");

        // Instant
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println("-----------------------------");

        //Duration
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow1 = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now1, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow1, timeMinus7Hours);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("-----------------------------");

        //Period
        LocalDate now2 = LocalDate.now();
        LocalDate nowAfterThreeYears = LocalDate.now().plusYears(3);
        Period period = Period.between(now2, nowAfterThreeYears);
        Period p1 = Period.ofDays(3);
        Period p2 = Period.ofWeeks(58);
        Period p3 = Period.ofMonths(3);
        Period p4 = Period.ofYears(3);

        System.out.println(period);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(Period.between(now2, now2.plusDays(p2.getDays())).getMonths());
        System.out.println(now.until(now2.plusDays(p2.getDays()), ChronoUnit.MONTHS));

        System.out.println("-----------------------------");

        //ChronoUnit
        LocalDateTime birthday = LocalDateTime.of(2001, Month.JUNE, 26, 6, 0, 0 );
        System.out.println(ChronoUnit.DAYS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthday, LocalDateTime.now()));

        System.out.println("-----------------------------");

        //Temporal Adjusters
        LocalDate now3 = LocalDate.now();
//        now3 = now.withDayOfMonth(20);
//        now3 = now.with(ChronoField.DAY_OF_MONTH, 20);
//        now3 = now.withMonth(10);
        System.out.println(now3);
        System.out.println(now3.getDayOfWeek());

        now3 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now3);
        System.out.println(now3.getDayOfWeek());

        now3 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now3);
        System.out.println(now3.getDayOfWeek());

        now3 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now3);
        System.out.println(now3.getDayOfWeek());

        System.out.println("-----------------------------");

        //Zoned Data Time, ZoneId
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = nowInstant.atOffset(offsetManaus);

        System.out.println(offsetDateTime);
        System.out.println(OffsetDateTime.of(dateTime, offsetManaus));

        nowInstant.atOffset(offsetManaus);
        System.out.println(nowInstant);

    }
}
