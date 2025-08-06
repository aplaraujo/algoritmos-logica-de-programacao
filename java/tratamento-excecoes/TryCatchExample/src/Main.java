import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("Fim do programa!");
    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vet = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vet[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe no vetor!");
        }
        catch (InputMismatchException e) {
            System.out.println("Não é um número!!!");
        }

        sc.close();
        System.out.println("***METHOD2 END***");
    }
}