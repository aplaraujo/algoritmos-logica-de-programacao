import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        NaoDivisivelPorDoisOuTres verifica = new NaoDivisivelPorDoisOuTres(num);

        System.out.println();
        System.out.print(verifica.verificaDivisivel());

        sc.close();
    }
}