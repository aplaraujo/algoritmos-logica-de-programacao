import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant_seg, hora, minuto, segundo, resto;

        System.out.print("Digite a duracao em segundos: ");
        quant_seg = sc.nextInt();

        hora = quant_seg / 3600;
        resto = quant_seg % 3600;
        minuto = resto / 60;
        segundo = resto % 60;

        System.out.println();

        sc.close();

    }
}
