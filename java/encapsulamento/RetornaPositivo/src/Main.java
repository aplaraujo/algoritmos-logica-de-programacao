import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, positivo;
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        RetornaPositivo verifica = new RetornaPositivo(num);

        positivo = verifica.verificaPositivo();

        System.out.println();
        System.out.println(positivo);

        sc.close();
    }
}