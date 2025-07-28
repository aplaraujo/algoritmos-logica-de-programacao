import entities.ExercicioNegativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, num;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        ExercicioNegativos[] numeros = new ExercicioNegativos[N];

        for(i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            numeros[i] = new ExercicioNegativos(num);
        }

        System.out.println();
        System.out.println("NUMEROS NEGATIVOS: ");
        for(i = 0; i < N; i++) {
            if (numeros[i].getNum() < 0) {
                System.out.println(numeros[i].getNum());
            }
        }

        sc.close();
    }
}