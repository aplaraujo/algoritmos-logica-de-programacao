package extra;

import extra.util.E1;

import java.util.Locale;
import java.util.Scanner;

public class PrestacaoB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        E1 valor_prestacao = new E1();

        int taxa, tempo;
        double valor, prestacao;

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();
        System.out.print("Digite o valor da taxa em atraso: ");
        taxa = sc.nextInt();
        System.out.print("Digite o tempo: ");
        tempo = sc.nextInt();

        prestacao = valor_prestacao.obterPrestacao(valor, taxa, tempo);

        System.out.printf("Valor da prestação: R$ %.2f", prestacao);

        sc.close();
    }
}
