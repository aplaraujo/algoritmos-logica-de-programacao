
import java.util.Locale;
import java.util.Scanner;
import model.entities.Average;
import model.services.AverageService;



public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double g1 = sc.nextDouble();
        double g2 = sc.nextDouble();

        AverageService av = new Average(g1, g2);

        System.out.println(av);

        sc.close();
    }
}
