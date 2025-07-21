import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, abaixo_10, entre_10_20, acima_20;
        double total_compra, total_venda, total;

        total_compra = 0;
        total_venda = 0;
        abaixo_10 = 0;
        entre_10_20 = 0;
        acima_20 = 0;

        System.out.print("Serao digitados dados de quantos produtos? ");
        N = sc.nextInt();

        double[] preco_compra = new double[N];
        double[] preco_venda = new double[N];
        double[] lucro = new double[N];
        String[] nome = new String[N];

        for (i = 0; i < N; i++) {
            System.out.printf("Produto %d: %n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Preco de compra: ");
            preco_compra[i] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            preco_venda[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (i = 0; i < N; i++) {
            total_compra = total_compra + preco_compra[i];
            total_venda = total_venda + preco_venda[i];
        }

        for (i = 0; i < N; i++) {
            lucro[i] = ((preco_venda[i] - preco_compra[i]) / preco_compra[i]) * 100;

            if (lucro[i] < 10) {
                abaixo_10++;
            } else {
                if (lucro[i] >= 10 && lucro[i] <= 20) {
                    entre_10_20++;
                } else {
                    acima_20++;
                }
            }
        }

        System.out.println("RELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + abaixo_10);
        System.out.println("Lucro entre 10% e 20%: " + entre_10_20);
        System.out.println("Lucro acima de 20%: " + acima_20);
        System.out.printf("Valor total de compra: %.2f %n", total_compra);
        System.out.printf("Valor total de venda: %.2f %n", total_venda);
        System.out.printf("Lucro total: %.2f", total_venda - total_compra);

        sc.close();
    }
}
