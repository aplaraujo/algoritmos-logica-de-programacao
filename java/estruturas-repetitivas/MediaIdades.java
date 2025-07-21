
import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int idade, soma, i;
        double media;

        soma = 0;
        i = 0;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            while (idade > 0) {
                soma += idade;
                idade = sc.nextInt();
                i++;
            }
             media = (double) soma / i;

            System.out.printf("MEDIA = %.2f", media);
        }

       

        sc.close();
    }
}
