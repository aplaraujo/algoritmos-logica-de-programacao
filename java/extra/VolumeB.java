package extra;

import extra.util.C1;

import java.util.Locale;
import java.util.Scanner;

public class VolumeB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        C1 v = new C1();

        double r, a, vol;

        System.out.print("Digite o raio de uma lata de óleo: ");
        r = sc.nextDouble();
        System.out.print("Digite a altura de uma lata de óleo: ");
        a = sc.nextDouble();

        vol = v.volume(r, a);
        System.out.printf("Volume da lata de óleo: %.4f", vol);

        sc.close();
    }
}
