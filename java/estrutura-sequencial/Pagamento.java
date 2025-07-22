import entities.ObterPagamento;
import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterPagamento pagamento = new ObterPagamento();

        System.out.print("Nome: ");
        pagamento.nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        pagamento.valor_hora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        pagamento.horas = sc.nextInt();

        System.out.println(pagamento);

        sc.close();
    }
}
