
import entities.ExercicioAbaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double soma, media, valor;

        soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        ExercicioAbaixoDaMedia[] num = new ExercicioAbaixoDaMedia[N];

        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           valor = sc.nextDouble();
           num[i] = new ExercicioAbaixoDaMedia(valor);
        }

        for (i = 0; i < N; i++) {
            soma = soma + num[i].getNum();
        }

        media = soma / N;

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (i = 0; i < N; i++) {
            if(num[i].getNum() < media) {
               System.out.println(num[i].getNum());
            }
        }

        System.out.printf("MEDIA DO VETOR = %.3f %n", media);
    }
}
