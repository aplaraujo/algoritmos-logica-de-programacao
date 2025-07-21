
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double soma, media;

        soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        double[] num = new double[N];

        for (i = 0; i < N; i++) {
           System.out.print("Digite um numero: ");
           num[i] = sc.nextDouble();
        }

        for (i = 0; i < N; i++) {
            soma = soma + num[i];
        }

        media = soma / N;

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (i = 0; i < N; i++) {
            if(num[i] < media) {
               System.out.println(num[i]); 
            }
        }

        System.out.printf("MEDIA DO VETOR = %.3f %n", media);
    }
}
