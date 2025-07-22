import entities.Salary;
import java.util.Locale;
import java.util.Scanner;

public class GetNetSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salary salary = new Salary();
        double percentageToIncrease;

        System.out.print("Name: ");
        salary.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        salary.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        salary.Tax = sc.nextDouble();

        System.out.println("Employee: " + salary);

        System.out.print("Which percentage to increase salary? ");
        percentageToIncrease = sc.nextDouble();
        salary.IncreaseSalary(percentageToIncrease);

        System.out.println("Updated data: " + salary);
        
        sc.close();

    }
}
