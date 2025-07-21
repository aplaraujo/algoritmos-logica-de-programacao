import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N;

        System.out.print("Quantos alunos serao digitados? ");
        N = sc.nextInt();

        String[] nomes = new String[N];
        double[] n1 = new double[N];
        double[] n2 = new double[N];
        double[] media = new double[N];

        for (i = 0; i < N; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
            nomes[i] = sc.next();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
        }

        for (i = 0; i < N; i++) {
            media[i] = (n1[i] + n2[i]) / 2;
        }

        System.out.println("Alunos aprovados:");
        for (i = 0; i < N; i++) {
            if (media[i] >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
