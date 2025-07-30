import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha, coluna;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        linha = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        coluna = sc.nextInt();

        int[][] matA = new int[linha][coluna];
        int[][] matB = new int[linha][coluna];
        int[][] matC = new int[linha][coluna];

        System.out.println();
        System.out.println("Digite os valores da matriz A: ");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
               System.out.printf("Elemento [%d,%d]: ", i, j);
               matA[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Digite os valores da matriz B: ");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println();
        System.out.println("MATRIZ SOMA:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("[%d]", matC[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
