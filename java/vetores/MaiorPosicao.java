
import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, posicao;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] num = new double[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble();
        }

        posicao = 0;
        maior = num[0];

        for (i = 0; i < N; i++) {
            if (num[i] > maior) {
                maior = num[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f %n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
    }
}
