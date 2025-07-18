import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valor_hora, salario;
        int horas;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        valor_hora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horas = sc.nextInt();

        salario = valor_hora * horas;

        System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", salario));

        sc.close();
    }
}
