import entities.ExercicioAprovados;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N;
        String nome;
        double nota1, nota2;

        System.out.print("Quantos alunos serao digitados? ");
        N = sc.nextInt();

        ExercicioAprovados[] nomes = new ExercicioAprovados[N];
        ExercicioAprovados[] n1 = new ExercicioAprovados[N];
        ExercicioAprovados[] n2 = new ExercicioAprovados[N];
        double[] media = new double[N];

        for (i = 0; i < N; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
            sc.nextLine();
            nome = sc.nextLine();
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nomes[i] = new ExercicioAprovados(nome);
            n1[i] = new ExercicioAprovados(nota1);
            n2[i] = new ExercicioAprovados(nota2);
        }

        for (i = 0; i < N; i++){
            media[i] = (n1[i].getNota() + n2[i].getNota()) / 2;
        }

        System.out.println("Alunos aprovados:");
        for (i = 0; i < N; i++) {
            if (media[i] > 6) {
                System.out.println(nomes[i].getNome());
            }
        }

        sc.close();
    }
}
