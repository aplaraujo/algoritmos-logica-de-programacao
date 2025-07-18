
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, j, quant;

        quant = 0;

        System.out.print("Qual a ordem da matriz? ");
        N = sc.nextInt();

        int [][] mat = new int[N][N];

        for (i = 0; i < N; i++) {
           for (j = 0; j < N; j++) {
            System.out.print("Elemento [" + i + "," + j + "]: ");
            mat[i][j] = sc.nextInt();
           } 
        }

        for (i = 0; i < N; i++) {
           for (j = 0; j < N; j++) {
            if (mat[i][j] < 0) {
                quant++;
            }
           } 
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        for (i = 0; i < N; i++) {
           for (j = 0; j < N; j++) {
            if(i == j) {
                System.out.println(mat[i][j] + " ");
            }
           } 
        }

        System.out.println("QUANTIDADE DE NEGATIVOS = " + quant);

        sc.close();
    }
}