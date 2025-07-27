import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.print("Digite um número inteiro: ");
        N = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci(N);

        fibonacci.sequencia();

        sc.close();
    }
}