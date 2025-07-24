package extra;

import extra.util.D1;

import java.util.Locale;
import java.util.Scanner;

public class LitrosB {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        D1 combustivel = new D1();
        int tempo, velocidade, distancia;
        double litros;

        System.out.print("Digite o tempo gasto na viagem: ");
        tempo = sc.nextInt();
        System.out.print("Digite a velocidade média: ");
        velocidade = sc.nextInt();

        distancia = combustivel.distancia(tempo, velocidade);
        litros = combustivel.litros(distancia);

        System.out.printf("Velocidade média: %d%n", velocidade);
        System.out.printf("Tempo gasto na viagem: %d%n", tempo);
        System.out.printf("Distância percorrida: %d%n", distancia);
        System.out.printf("Litros usados: %.1f", litros);

        sc.close();
    }
}
