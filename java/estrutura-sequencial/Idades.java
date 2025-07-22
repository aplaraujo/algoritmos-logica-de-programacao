
import entities.ObterIdades;
import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterIdades idade;
        idade = new ObterIdades();

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        idade.nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade.idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        idade.nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade.idade2 = sc.nextInt();

        System.out.println(idade);

        sc.close();
    }
}
