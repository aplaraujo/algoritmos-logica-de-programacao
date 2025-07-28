
import entities.ExercicioMediaPares;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, N, quant, valor;

        quant = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        ExercicioMediaPares[] num = new ExercicioMediaPares[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            valor = sc.nextInt();
            num[i] = new ExercicioMediaPares(valor);
        }

        for (i = 0; i < N; i++) {
            if (num[i].getNum() % 2 == 0) {
                quant++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for (i = 0; i < N; i++) {
            if (num[i].getNum() % 2 == 0) {
                System.out.print(num[i].getNum() + " ");
            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", quant);
    }
}
