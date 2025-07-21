import java.util.Scanner;

public class Soma {

    public static int Obter_Soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        soma = Obter_Soma(x, y);

        System.out.printf("SOMA = %d", soma);

        sc.close();
    }
}
