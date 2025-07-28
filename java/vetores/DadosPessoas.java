import entities.ExercicioDadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, quant_homens, quant_mulheres;
        char sexo;
        double maior, menor, soma, media_mulheres, altura;

        quant_homens = 0;
        quant_mulheres = 0;
        soma = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        ExercicioDadosPessoas[] genero = new ExercicioDadosPessoas[N];
        ExercicioDadosPessoas[] alturas = new ExercicioDadosPessoas[N];

        for (i = 0; i < N; i++) {
            System.out.printf("Altura da %da pessoa: %n", i+1);
            altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: %n", i+1);
            sexo = sc.next().charAt(0);
            alturas[i] = new ExercicioDadosPessoas(altura);
            genero[i] = new ExercicioDadosPessoas(sexo);

            if (genero[i].getGenero() == 'M') {
                quant_homens++;
            } else {
                soma = (double) alturas[i].getAltura() + soma;
                quant_mulheres++;
            }
        }

        maior = alturas[0].getAltura();
        menor = alturas[0].getAltura();

        for (i = 0; i < N; i++) {
            if(alturas[i].getAltura() > maior) {
                maior = alturas[i].getAltura();
            }

            if(alturas[i].getAltura() < menor) {
                menor = alturas[i].getAltura();
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
