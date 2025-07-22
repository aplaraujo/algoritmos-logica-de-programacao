import entities.ObterDuracao;
import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterDuracao duracao = new ObterDuracao();

        System.out.print("Digite a duracao em segundos: ");
        duracao.quantidade_segundos = sc.nextInt();

       
        System.out.println(duracao);

        sc.close();

    }
}
