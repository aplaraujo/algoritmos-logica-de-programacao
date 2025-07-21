import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, maior, posicao;

        maior = 0;
        posicao = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        int[] idades = new int[N];
        String[] nomes = new String[N];

        for (i = 0; i < N; i++) {
           System.out.printf("Dados da %da pessoa:", i+1);
           System.out.println();
           System.out.print("Nome: ");
           nomes[i] = sc.next();
           System.out.print("Idade: ");
           idades[i] = sc.nextInt();
        }

        for (i = 0; i < N; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                posicao = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicao]);
    }
}
