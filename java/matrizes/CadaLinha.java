import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, maior;

        System.out.print("Qual a ordem da matriz? ");
        N = sc.nextInt();

        int[][] mat = new int[N][N];
        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            maior = 0;
            for (int j = 0; j < N; j++) {
               if (mat[i][j] > maior) {
                   maior = mat[i][j];
               }
            }
            vet[i] = maior;
        }

        System.out.println();
        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");

        for (int i = 0; i < N; i++) {
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
