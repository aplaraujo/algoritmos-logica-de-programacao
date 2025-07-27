import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao, quantProdA, quantProdB;
        double precoProdA, precoProdB, total;
        CompraTotal compraTotal;
        char response;

        System.out.print("Digite uma opção (1 ou 2): ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o produto (A/B): ");
            response = sc.next().charAt(0);
            if (response == 'A') {
                System.out.print("Digite a quantidade do produto A: ");
                quantProdA = sc.nextInt();
                System.out.print("Digite o preço do produto A: ");
                precoProdA = sc.nextDouble();
                compraTotal = new CompraTotal(quantProdA, precoProdA);
                total = compraTotal.totalUmProduto(quantProdA, precoProdA);
                System.out.println();
                System.out.printf("Total produto A: R$ %.2f%n", total);
            } else {
                System.out.print("Digite a quantidade do produto B: ");
                quantProdB = sc.nextInt();
                System.out.print("Digite o preço do produto B: ");
                precoProdB = sc.nextDouble();
                compraTotal = new CompraTotal(quantProdB, precoProdB);
                total = compraTotal.totalUmProduto(quantProdB, precoProdB);
                System.out.printf("Total produto A: R$ %.2f%n", total);
            }
        } else {
            System.out.print("Digite a quantidade do produto A: ");
            quantProdA = sc.nextInt();
            System.out.print("Digite o preço do produto A: ");
            precoProdA = sc.nextDouble();
            System.out.print("Digite a quantidade do produto B: ");
            quantProdB = sc.nextInt();
            System.out.print("Digite o preço do produto B: ");
            precoProdB = sc.nextDouble();
            compraTotal = new CompraTotal(quantProdA, precoProdA, quantProdB, precoProdB);
            total = compraTotal.totalDoisProdutos(quantProdA, quantProdB, precoProdA, precoProdB);
            System.out.printf("Total produtos A e B: R$ %.2f%n", total);
        }

        sc.close();
    }
}