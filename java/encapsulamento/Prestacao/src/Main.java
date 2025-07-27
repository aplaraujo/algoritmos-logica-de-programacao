import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, taxa;
        double valor, prestacao;

        System.out.print("Digite o valor em atraso: ");
        valor = sc.nextDouble();
        System.out.print("Digite a taxa: ");
        taxa = sc.nextInt();
        System.out.print("Digite o tempo: ");
        tempo = sc.nextInt();
        A valorPrestacao = new A(valor, taxa, tempo);

        prestacao = valorPrestacao.prestacao(valor, taxa, tempo);

        System.out.printf("Valor da prestação:  R$ %.2f%n ", prestacao);

        sc.close();
    }
}