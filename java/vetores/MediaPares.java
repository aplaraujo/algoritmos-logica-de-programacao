
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, N, quant;

        quant = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        int[] num = new int[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        for (i = 0; i < N; i++) {
            if (num[i] % 2 == 0) {
                quant++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for (i = 0; i < N; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", quant);
    }
}
