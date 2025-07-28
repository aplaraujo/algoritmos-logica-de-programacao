import entities.ExercicioMaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, maior, posicao, idade;
        String nome;

        maior = 0;
        posicao = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        ExercicioMaisVelho[] idades = new ExercicioMaisVelho[N];
        ExercicioMaisVelho[] nomes = new ExercicioMaisVelho[N];

        for (i = 0; i < N; i++) {
           System.out.printf("Dados da %da pessoa:", i+1);
           System.out.println();
           System.out.print("Nome: ");
           nome = sc.next();
           System.out.print("Idade: ");
           idade = sc.nextInt();

           nomes[i] = new ExercicioMaisVelho(nome);
           idades[i] = new ExercicioMaisVelho(idade);
        }

        for (i = 0; i < N; i++) {
            if (idades[i].getIdade() > maior) {
                maior = idades[i].getIdade();
                posicao = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicao].getNome());
    }
}
