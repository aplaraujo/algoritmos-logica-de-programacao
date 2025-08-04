import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, quantEmployees;
        String name;
        double anualIncome, healthExpenditures, taxSum;
        char response;
        List<TaxPayer> list = new ArrayList<TaxPayer>();

        taxSum = 0.0;

        System.out.print("Enter the number of tax payers: ");
        N = sc.nextInt();

        for(i = 1; i <= N; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Anual income: ");
            anualIncome = sc.nextDouble();
            if (response == 'i') {
                System.out.print("Health expenditures: ");
                healthExpenditures = sc.nextDouble();
                Individual person = new Individual(name, anualIncome, healthExpenditures);
                list.add(person);
            } else {
                System.out.print("Number of employees: ");
                quantEmployees = sc.nextInt();
                Company company = new Company(name, anualIncome, quantEmployees);
                list.add(company);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for(TaxPayer tax: list) {
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
        }

        for(TaxPayer tax: list) {
            taxSum += tax.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", taxSum));

        sc.close();
    }
}