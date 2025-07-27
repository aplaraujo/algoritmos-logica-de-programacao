import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, fat;
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        Fatorial fatorial = new Fatorial(num);
        fat = fatorial.calculaFatorial();

        System.out.println();
        System.out.printf("Fatorial de %d: %d", num, fat);

        sc.close();
    }
}