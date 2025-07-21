import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, quant_homens, quant_mulheres;
        double maior, menor, soma, media_mulheres;

        quant_homens = 0;
        quant_mulheres = 0;
        soma = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        char[] genero = new char[N];
        double[] alturas = new double[N];

        for (i = 0; i < N; i++) {
            System.out.printf("Altura da %da pessoa: %n", i);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: %n", i);
            genero[i] = sc.next().charAt(0);

            if (genero[i] == 'M') {
                quant_homens++;
            } else {
                soma = (double) alturas[i] + soma;
                quant_mulheres++;
            }
        }

        maior = alturas[0];
        menor = alturas[0];

        for (i = 0; i < N; i++) {
            if(alturas[i] > maior) {
                maior = alturas[i];
            }

            if(alturas[i] < menor) {
                menor = alturas[i];
            }
        }

        media_mulheres = (double) soma / quant_mulheres;

        System.out.printf("Menor altura = %.2f %n", menor);
        System.out.printf("Maior altura = %.2f %n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f %n", media_mulheres);
        System.out.printf("Numero de homens = %d", quant_homens);

        sc.close();

    }
}
