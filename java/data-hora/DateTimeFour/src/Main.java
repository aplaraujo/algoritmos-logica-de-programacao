import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2025-07-30");
        LocalDateTime d2 = LocalDateTime.parse("2025-07-30T19:54:24");
        Instant d3 = Instant.parse("2025-07-30T22:54:24Z");

        LocalDate pastWeekDate = d1.minusDays(7);
        LocalDate nextWeekDate = d1.plusDays(7);
        LocalDate nextYearDate = d1.plusYears(1);

        LocalDateTime pastWeekDateTime = d2.minusDays(7);
        LocalDateTime nextWeekDateTime = d2.plusDays(7);

        Instant pastWeekDateInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekDateInstant = d3.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekDateTime, d2);
        Duration t2 = Duration.between(pastWeekDate.atStartOfDay(), d1.atStartOfDay());
        Duration t3 = Duration.between(pastWeekDateInstant, d3);
        Duration t4 = Duration.between(d3, pastWeekDateInstant);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Past week: " + pastWeekDate);
        System.out.println("Next week: " + nextWeekDate);
        System.out.println("Next year: " + nextYearDate);
        System.out.println("Past week: " + pastWeekDateTime);
        System.out.println("Next week: " + nextWeekDateTime);
        System.out.println("Past week: " + pastWeekDateInstant);
        System.out.println("Next week: " + nextWeekDateInstant);
        System.out.println("t1: " + t1.toDays());
        System.out.println("t2: " + t2.toDays());
        System.out.println("t3: " + t3.toDays());
        System.out.println("t4: " + t4.toDays());
        System.out.println("------------------------------------------");
        System.out.println();
    }
}