package extra;

import extra.util.F2;

import java.util.Scanner;

public class SomaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, total;

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        total = F2.soma(N);
        System.out.printf("Valor da soma: %d", total);
        sc.close();
    }
}
