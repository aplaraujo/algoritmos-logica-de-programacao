import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, x, i;

        System.out.print("Quantos numeros voce vai digitar? ");
        x = sc.nextInt();

        for (i = 0; i < x; i++) {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();

            if (num == 0) {
                System.out.println("NULO");
            } else {
                if (num % 2 == 0 && num < 0) {
                    System.out.println("PAR NEGATIVO");
                } else if (num % 2 == 0 && num > 0) {
                    System.out.println("PAR POSITIVO");
                } else if (num % 2 == 1 && num < 0) {
                    System.out.println("IMPAR NEGATIVO");
                } else {
                    System.out.println("IMPAR POSITIVO");
                }
            }
        }

        sc.close();
    }
}
