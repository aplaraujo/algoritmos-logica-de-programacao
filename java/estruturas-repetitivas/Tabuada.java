
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N, mult;

        System.out.print("Deseja a tabuada para qual valor? ");
        N = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            mult = N * i;
            System.out.printf("%d x %d = %d %n", N, i, mult);
        }

        sc.close();
    }
}
