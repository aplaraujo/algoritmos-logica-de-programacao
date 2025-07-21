import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;
        int x, i;

        System.out.print("Quantos casos voce vai digitar? ");
        x = sc.nextInt();

        for (i = 0; i < x; i++) {
            System.out.println("Digite tres numeros: ");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.printf("MEDIA = %.1f %n", media);
        }

        sc.close();
    }
}
