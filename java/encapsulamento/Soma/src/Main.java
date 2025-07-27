import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, soma;
        soma = 0;
        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();
        Soma novaSoma = new Soma(N);

        soma = novaSoma.obterSoma();

        System.out.println("Valor da soma: " + soma);

        sc.close();
    }
}