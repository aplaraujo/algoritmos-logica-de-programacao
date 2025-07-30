import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // LocalDate: data-hora local
        // LocalDateTime: data-hora local
        // Instant: data-hora global

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();
        LocalDate d4 = LocalDate.parse("2025-07-30");
        LocalDateTime d5 = LocalDateTime.parse("2025-07-30T19:54:24");
        Instant d6 = Instant.parse("2025-07-30T19:54:24Z");
        Instant d7 = Instant.parse("2025-07-30T19:54:24-03:00");
        LocalDate d8 = LocalDate.parse("30/07/2025", fm1);
        LocalDateTime d9 = LocalDateTime.parse("30/07/2025 22:00", fm2);
        LocalDate d10 = LocalDate.of(2025, 7, 30);
        LocalDateTime d11 = LocalDateTime.of(2025, 7, 30, 22, 00);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);
        System.out.println("d5: " + d5);
        System.out.println("d6: " + d6);
        System.out.println("d7: " + d7);
        System.out.println("d8: " + d8);
        System.out.println("d9: " + d9);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
        System.out.println("------------------------------------------");
        System.out.println();
    }
}