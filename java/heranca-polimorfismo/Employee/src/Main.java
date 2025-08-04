import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, hours;
        char response;
        String name;
        Double valuePerHour, additionalCharge;
        Employee emp;
        List<Employee> employees = new ArrayList<Employee>();

        System.out.print("Enter the number of employees:");
        N = sc.nextInt();

        for (i = 1; i <= N; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Hours: ");
            hours = sc.nextInt();
            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();

            if (response == 'y') {
                System.out.print("Additional charge: ");
                additionalCharge = sc.nextDouble();
                emp = new OutsorcedEmployee(name, hours, valuePerHour,additionalCharge);
                employees.add(emp);
            } else {
                emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee employee: employees) {
            System.out.println(employee.getName() + " - $ " + employee.payment());
        }



        sc.close();
    }
}