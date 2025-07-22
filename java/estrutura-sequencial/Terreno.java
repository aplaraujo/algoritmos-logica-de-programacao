
import entities.ObterTerreno;
import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterTerreno terreno;
        terreno = new ObterTerreno();

        System.out.print("Digite a largura do terreno: ");
        terreno.l = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        terreno.c = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        terreno.m = sc.nextDouble();

        System.out.println();
        System.out.println(terreno);

        sc.close();

    }
}
