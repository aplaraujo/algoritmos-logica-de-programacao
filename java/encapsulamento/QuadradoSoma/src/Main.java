import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, soma;
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        QuadradoSoma novaSoma = new QuadradoSoma(A, B, C);

        soma = novaSoma.soma();

        System.out.println();
        System.out.println("Resultado: " + soma);

        sc.close();
    }
}