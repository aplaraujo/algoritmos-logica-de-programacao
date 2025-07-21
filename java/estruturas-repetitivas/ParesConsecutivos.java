
import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, soma, cont, atual;

        System.out.print("Digite um numero inteiro: ");
        x = sc.nextInt();

        while (x > 0) {
            if (x % 2 == 1) {
                x++;
            }

            soma = 0;
            atual = x;
            cont = 0;

            while(cont < 5) {
                soma = soma + atual;
                atual += 2;
                cont++;
            }

            System.out.printf("SOMA = %d %n", soma);

            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();
        }

        sc.close();
    }
}
