
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N;

        System.out.print("Quantos valores vai ter cada vetor? ");
        N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        System.out.println("Digite os valores do vetor A: ");
        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           A[i] = sc.nextInt(); 
        }

        System.out.println("Digite os valores do vetor B: ");
        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           B[i] = sc.nextInt(); 
        }

        for (i = 0; i < N; i++) {
           C[i] = A[i] + B[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (i = 0; i < N; i++) {
           System.out.println(C[i]);
        }

        sc.close();
    }
}
