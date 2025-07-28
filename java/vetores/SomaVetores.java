
import entities.ExercicioSomaVetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N, valor;

        System.out.print("Quantos valores vai ter cada vetor? ");
        N = sc.nextInt();

        ExercicioSomaVetores[] A = new ExercicioSomaVetores[N];
        ExercicioSomaVetores[] B = new ExercicioSomaVetores[N];
        int[] C = new int[N];

        System.out.println("Digite os valores do vetor A: ");
        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           valor = sc.nextInt();
           A[i] = new ExercicioSomaVetores(valor);
        }

        System.out.println("Digite os valores do vetor B: ");
        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           valor = sc.nextInt();
           B[i] = new ExercicioSomaVetores(valor);
        }

        for (i = 0; i < N; i++) {
           C[i] = A[i].getNum() + B[i].getNum();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (i = 0; i < N; i++) {
           System.out.println(C[i]);
        }

        sc.close();
    }
}
