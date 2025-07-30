import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, soma;

        soma = 0;

        System.out.print("Qual a ordem da matriz? ");
        N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                soma += mat[i][j];
            }
        }

        System.out.println();
        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
        sc.close();
    }
}
