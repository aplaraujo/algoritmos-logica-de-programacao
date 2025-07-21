
import java.util.Scanner;

public class SequenciaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, i;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        for(i = 1; i <= x; i++) {
            if (i % 2 == 1) {
               System.out.printf("%d %n", i); 
            }
        }

        sc.close();
    }
}
