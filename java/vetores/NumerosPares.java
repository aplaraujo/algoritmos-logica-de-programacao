import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, quant, soma;
        double media;

        quant = 0;
        soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        int[] num = new int[N]; 

        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           num[i] = sc.nextInt();
        }

        for (i = 0; i < N; i++) {
           if (num[i] % 2 == 0) {
            soma = soma + num[i];
            quant++;
           }
        }

        if (quant > 0) {
            media = (double) soma / quant;
            System.out.printf("MEDIA DOS PARES = %.1f %n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
