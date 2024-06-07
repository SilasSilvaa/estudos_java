package utilityClasses.localJava8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class GetNextUtilDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays = switch (dayOfWeek){
            case THURSDAY -> 4;
            case FRIDAY -> 3;
            case SATURDAY ->  2;
            default -> 1;
        };

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class Exercise {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());

        localDate = LocalDate.now().with(new GetNextUtilDay());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
    }
}
