package extra;

import extra.util.D2;

import java.util.Locale;
import java.util.Scanner;

public class LitrosC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade, distancia;
        double litros;

        System.out.print("Digite o tempo gasto na viagem: ");
        tempo = sc.nextInt();
        System.out.print("Digite a velocidade média: ");
        velocidade = sc.nextInt();

        distancia = D2.distancia(tempo, velocidade);
        litros = D2.litros(distancia);

        System.out.printf("Velocidade média: %d%n", velocidade);
        System.out.printf("Tempo gasto na viagem: %d%n", tempo);
        System.out.printf("Distância percorrida: %d%n", distancia);
        System.out.printf("Litros usados: %.1f", litros);

        sc.close();
    }
}
