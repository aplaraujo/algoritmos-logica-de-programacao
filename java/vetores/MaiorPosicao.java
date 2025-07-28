
import entities.ExercicioMaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, posicao;
        double maior, valor;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        ExercicioMaiorPosicao[] num = new ExercicioMaiorPosicao[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            valor = sc.nextDouble();
            num[i] = new ExercicioMaiorPosicao(valor);
        }

        posicao = 0;
        maior = num[0].getNum();

        for (i = 0; i < N; i++) {
            if (num[i].getNum() > maior) {
                maior = num[i].getNum();
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f %n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
    }
}
