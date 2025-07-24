package extra;

import extra.util.F1;

import java.util.Scanner;

public class SomaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        F1 soma = new F1();
        int N, total;

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        total = soma.soma(N);
        System.out.printf("Valor da soma: %d", total);

        sc.close();
    }
}
