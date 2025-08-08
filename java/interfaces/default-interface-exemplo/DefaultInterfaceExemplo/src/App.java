
import java.util.Locale;
import java.util.Scanner;
import services.BrazilInterestService;
import services.InterestService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.printf("Payment after %d months: %.2f%n", months, payment);

        sc.close();
    }
}
