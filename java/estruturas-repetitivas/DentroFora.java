import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, i, dentro, fora, num;

        dentro = 0;
        fora = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();

            if (num >= 10 && num <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.printf("%d DENTRO %n", dentro);
        System.out.printf("%d FORA %n", fora);

        sc.close();
    }
}
