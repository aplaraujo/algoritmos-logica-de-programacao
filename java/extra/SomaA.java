package extra;

import java.util.Scanner;

public class SomaA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, total;

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        total = soma(N);
        System.out.printf("Valor da soma: %d", total);

        sc.close();
    }

    public static int soma(int n) {
        int total, i;
        total = 0;

        for (i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }
}
