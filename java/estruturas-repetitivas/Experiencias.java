import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int x, rato, sapo, coelho, total, i, num;
        char cobaia;
        double percentual_sapo, percentual_coelho, percentual_rato;

        System.out.print("Quantos casos de teste serao digitados?: ");
        x = sc.nextInt();

        rato = 0;
        sapo = 0;
        coelho = 0;

        for (i = 1; i <= x; i++) {
           System.out.print("Quantidade de cobaias: ");
           num = sc.nextInt();
           System.out.print("Tipo de cobaia: ");
           cobaia = sc.next().charAt(0);

           if (cobaia == 'R') {
            rato = rato + num;
           } else {
            if (cobaia == 'S') {
                sapo = sapo + num;
            } else {
                coelho = coelho + num;
            }
           }            
        }

        total = coelho + rato + sapo;
        percentual_coelho = (double) coelho / total * 100;
        percentual_rato = (double) rato / total * 100;
        percentual_sapo = (double) sapo / total * 100;

        System.out.println("RELATORIO FINAL: ");
        System.out.printf("Total: %d cobaias %n", total);
        System.out.printf("Total de coelhos: %d %n", coelho);
        System.out.printf("Total de ratos: %d %n", rato);
        System.out.printf("Total de sapos: %d %n", sapo);
        System.out.printf("Percentual de coelhos: %.2f %n", percentual_coelho);
        System.out.printf("Percentual de ratos: %.2f %n", percentual_rato);
        System.out.printf("Percentual de sapos: %.2f %n", percentual_sapo);


        sc.close();
    }
}
