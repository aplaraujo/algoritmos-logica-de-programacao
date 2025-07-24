package extra;

import extra.util.C2;

import java.util.Locale;
import java.util.Scanner;

public class VolumeC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, altura, volume;
        System.out.print("Digite o raio de uma lata de óleo: ");
        raio = sc.nextDouble();
        System.out.print("Digite a altura de uma lata de óleo: ");
        altura = sc.nextDouble();
        volume = C2.volume(raio, altura);
        System.out.printf("Volume da lata de óleo: %.4f", volume);

        sc.close();
    }
}
