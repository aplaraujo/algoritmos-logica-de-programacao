import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        int[] num = new int[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextInt();
        }


        System.out.println("NUMEROS NEGATIVOS:");
        for (i = 0; i < N; i++) {
            if(num[i] < 0) {
                System.out.printf("%d %n", num[i]);
            }
        }

        sc.close();
    }
}