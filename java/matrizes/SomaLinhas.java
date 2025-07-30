import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna, somaLinha;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        linha = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        coluna = sc.nextInt();

        int[][] mat = new int[linha][coluna];
        int[] vet = new int[linha];

        for (int i = 0; i < linha; i++) {
            System.out.printf("Digite os elementos da %da. linha:", i+1);
            System.out.println();
            for (int j = 0; j < coluna; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            somaLinha = 0;
            for (int j = 0; j < coluna; j++) {
                somaLinha += mat[i][j];
            }
            vet[i] = somaLinha;
        }

        System.out.println();
        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < coluna; i++) {
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
