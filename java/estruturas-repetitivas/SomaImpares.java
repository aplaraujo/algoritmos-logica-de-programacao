import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, aux, i, soma;

        soma = 0;

        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        for(i = x+1; i < y; i++) {
            if(i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println("SOMA DOS IMPARES = " + soma);

        sc.close();
    }    
}
