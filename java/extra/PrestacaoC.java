package extra;

import extra.util.E2;

import java.util.Locale;
import java.util.Scanner;

public class PrestacaoC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int taxa, tempo;
        double valor, prestacao;

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();
        System.out.print("Digite o valor da taxa em atraso: ");
        taxa = sc.nextInt();
        System.out.print("Digite o tempo: ");
        tempo = sc.nextInt();

        prestacao = E2.obterPrestacao(valor, taxa, tempo);

        System.out.printf("Valor da prestação: R$ %.2f", prestacao);
        sc.close();
    }
}
