
import entities.ExercicioAlturas;

import java.util.Locale;
import java.util.Scanner;


public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, menos_16, idade;
        String nome;
        double total_altura, media_altura, percentual_menos_16, altura;

        total_altura = 0;
        menos_16 = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        ExercicioAlturas[] nomes = new ExercicioAlturas[N];
        ExercicioAlturas[] idades = new ExercicioAlturas[N];
        ExercicioAlturas[] alturas = new ExercicioAlturas[N];

        for (i = 0; i < N; i++) {
           System.out.printf("Dados da %da pessoa:", i+1);
           System.out.println();
           System.out.print("Nome: ");
           nome = sc.next();
           System.out.print("Idade: ");
           idade = sc.nextInt();
           System.out.print("Altura: ");
           altura = sc.nextDouble();
           sc.nextLine();

           nomes[i] = new ExercicioAlturas(nome);
           idades[i] = new ExercicioAlturas(idade);
           alturas[i] = new ExercicioAlturas(altura);
        }

        for (i = 0; i < N; i++) {
            total_altura = total_altura + alturas[i].getAltura();
        }

        for (i = 0; i < N; i++) {
            if (idades[i].getIdade() < 16) {
                menos_16++;
            }
        }

        media_altura = total_altura / N;
        percentual_menos_16 = (double) menos_16 / N * 100;

        System.out.printf("Altura média: %.2f%n", media_altura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentual_menos_16);

        for (i = 0; i < N; i++) {
            if (idades[i].getIdade() < 16) {
                System.out.println(nomes[i].getNome());
            }
        }

        sc.close();
    }
}
