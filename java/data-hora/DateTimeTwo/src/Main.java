import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Formatação de data e hora personalizada
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d1 = LocalDate.parse("2025-07-30");
        LocalDateTime d2 = LocalDateTime.parse("2025-07-30T19:54:24");
        Instant d3 = Instant.parse("2025-07-30T19:54:24Z");

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("d1: " + d1.format(fm1));
        System.out.println("d1: " + fm1.format(d1));
        System.out.println("d1: " + d1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d2: " + d2.format(fm2));
        System.out.println("d2: " + fm2.format(d2));
        System.out.println("d2: " + d2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("d2: " + d2.format(fm4));
        System.out.println("d3: " + fm3.format(d3));
        System.out.println("d3: " + fm5.format(d3));
        System.out.println("------------------------------------------");
        System.out.println();
    }
}