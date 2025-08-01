import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Digite um numero de 1 a 12: ");
        N = sc.nextInt();

        switch(N) {
            case 1:
                System.out.println(MonthStatus.Janeiro);
                break;
            case 2:
                System.out.println(MonthStatus.Fevereiro);
                break;
            case 3:
                System.out.println(MonthStatus.Março);
                break;
            case 4:
                System.out.println(MonthStatus.Abril);
                break;
            case 5:
                System.out.println(MonthStatus.Maio);
                break;
            case 6:
                System.out.println(MonthStatus.Junho);
                break;
            case 7:
                System.out.println(MonthStatus.Julho);
                break;
            case 8:
                System.out.println(MonthStatus.Agosto);
                break;
            case 9:
                System.out.println(MonthStatus.Setembro);
                break;
            case 10:
                System.out.println(MonthStatus.Outubro);
                break;
            case 11:
                System.out.println(MonthStatus.Novembro);
                break;
            case 12:
                System.out.println(MonthStatus.Dezembro);
                break;
            default:
                System.out.println("Valor inválido!");
        }

        sc.close();
    }
}