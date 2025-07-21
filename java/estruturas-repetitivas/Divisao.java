import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double div;
        int x, i, num, den;

        System.out.print("Quantos casos voce vai digitar? ");
        x = sc.nextInt();

        for (i = 0; i < x; i++) {
           System.out.print("Entre com o numerador: ");
           num = sc.nextInt();
           System.out.print("Entre com o denominador: ");
           den = sc.nextInt(); 

           if (den == 0) {
            System.out.println("DIVISAO IMPOSSIVEL");
           } else {
            div = (double) num / den;
            System.out.printf("DIVISAO = %.2f %n", div);
           }
        }

        sc.close();
    }
}
