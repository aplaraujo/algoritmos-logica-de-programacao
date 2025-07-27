import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, expoente, potencia;
        System.out.print("Digite a base: ");
        base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        expoente = sc.nextInt();
        Potencia pot = new Potencia(base, expoente);

        potencia = pot.potencia();

        System.out.println();
        System.out.println("Resultado: " + potencia);

        sc.close();
    }
}