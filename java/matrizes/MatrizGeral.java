import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, somaPositivos, linha, coluna;

        somaPositivos = 0;

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
            for (int j = 0; j < N; j++) {
                if (mat[i][j] > 0) {
                    somaPositivos += mat[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("SOMA DOS POSITIVOS: " + somaPositivos);

        System.out.println();
        System.out.print("Escolha uma linha: ");
        linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == linha) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.print("Escolha uma coluna: ");
        coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == coluna) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("MATRIZ ALTERADA: ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    System.out.print(mat[i][j] * mat[i][j] + " ");
                } else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
