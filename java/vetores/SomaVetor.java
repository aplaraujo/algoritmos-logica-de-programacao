import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double soma, media;

        soma = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        for (i = 0; i < N; i++) {
            soma = soma + vet[i];
        }

        media = soma / N;

        System.out.print("VALORES = ");
        for (i = 0; i < N; i++) {
            System.out.print(String.format("%.1f", vet[i]) + " ");
        }

        System.out.println();
        System.out.println("SOMA = " + String.format("%.1f", soma));
        System.out.println("MEDIA = " + String.format("%.1f", media));

        sc.close();
    }
}
