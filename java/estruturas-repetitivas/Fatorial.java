import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       int i, N, fat;

       System.out.print("Digite o valor de N: ");
       N = sc.nextInt();

       fat = 1;

       for (i = 1; i <= N; i++) {
           fat = fat * i;
       }

       System.out.printf("FATORIAL = %d", fat);

        sc.close();
    }
}
