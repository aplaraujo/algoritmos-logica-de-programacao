import java.util.Scanner;

public class PosicaoElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna, X;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        linha = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        coluna = sc.nextInt();

        int[][] mat = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("----- Matriz criada -----");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("[%d]", mat[i][j]);
            }
            System.out.println();
        }

        System.out.print("Digite um número que está presente na matriz: ");
        X = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == X) {
                    System.out.printf("Posição %d, %d", i, j);
                    System.out.println();

                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }

                    if (i > 0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }

                    if (j < mat[i].length - 1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }

                    if (i < mat.length - 1) {
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
