import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

    public static double Obter_Sal(double v, double h) {
        return ((double) v * h);
    }
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

        salario = Obter_Sal(valor_hora, horas);

        System.out.printf("O pagamento para %s deve ser %.2f", nome, salario);

        sc.close();
    }
}
