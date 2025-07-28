import entities.ExercicioSomaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double soma, media, valor;

        soma = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        ExercicioSomaVetor[] vet = new ExercicioSomaVetor[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            valor = sc.nextDouble();
            vet[i] = new ExercicioSomaVetor(valor);
        }

        for (i = 0; i < N; i++) {
            soma = soma + vet[i].getNum();
        }

        media = soma / N;

        System.out.print("VALORES = ");
        for (i = 0; i < N; i++) {
            System.out.print(String.format("%.1f", vet[i].getNum()) + " ");
        }

        System.out.println();
        System.out.println("SOMA = " + String.format("%.1f", soma));
        System.out.println("MEDIA = " + String.format("%.1f", media));

        sc.close();
    }
}
