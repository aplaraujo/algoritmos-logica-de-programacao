
import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, media;

        System.out.print("Digite a primeira nota: ");
        do {
            n1 = sc.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.print("Valor invalido! Tente novamente: ");
            }
        } while (n1 < 0 || n1 > 10);

        System.out.print("Digite a segunda nota: ");
        do {
            n2 = sc.nextDouble();
            if (n2 < 0 || n2 > 10) {
                System.out.print("Valor invalido! Tente novamente: ");
            }
        } while (n2 < 0 || n2 > 10);

        media = (n1 + n2) / 2;

        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}
