
import entities.ObterSoma;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ObterSoma soma;
        soma = new ObterSoma();

        System.out.print("Digite o valor de X: ");
        soma.x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        soma.y = sc.nextInt();

        System.out.println(soma);

        sc.close();
    }
}
