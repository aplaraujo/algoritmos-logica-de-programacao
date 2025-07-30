import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Converter data-hora global para local

        LocalDate d1 = LocalDate.parse("2025-07-30");
        LocalDateTime d2 = LocalDateTime.parse("2025-07-30T19:54:24");
        Instant d3 = Instant.parse("2025-07-30T22:54:24Z");

        LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));

//        System.out.println("---------------------");
//        System.out.println();
//        for(String timeZone: ZoneId.getAvailableZoneIds()) {
//            System.out.println(timeZone);
//        }
//        System.out.println();
//        System.out.println("---------------------");

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);
        System.out.println("d1: " + d1.getDayOfMonth());
        System.out.println("d1: " + d1.getMonth());
        System.out.println("d1: " + d1.getMonthValue());
        System.out.println("d1: " + d1.getYear());
        System.out.println("d2: " + d2.getHour());
        System.out.println("d2: " + d2.getMinute());
        System.out.println("------------------------------------------");
        System.out.println();
    }
}