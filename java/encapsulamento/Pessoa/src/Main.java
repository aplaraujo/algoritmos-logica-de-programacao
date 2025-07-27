import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, verifica;
        char genero;

        System.out.print("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.print("Digite o gênero da pessoa: ");
        genero = sc.next().charAt(0);
        sc.nextLine();
        Pessoa pessoa = new Pessoa(nome, genero);

        verifica = pessoa.verificaPessoa();

        System.out.println();
        System.out.println(verifica);


        sc.close();
    }
}