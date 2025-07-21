
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, alcool, gasolina, diesel;

        alcool = 0;
        gasolina = 0;
        diesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            }
            if (codigo == 2) {
                gasolina++;
            }
            if (codigo == 3) {
                diesel++;
            }

            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d %n", alcool);
        System.out.printf("Gasolina: %d %n", gasolina);
        System.out.printf("Diesel: %d", diesel);
        sc.close();
    }
}
