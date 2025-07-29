import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        int N, i, employeeId;
        double percentage;
        System.out.print("How many employees will be registered? ");
        N = sc.nextInt();

        for(i = 0; i < N; i++) {
            System.out.println();
            System.out.printf("Employee #%d:", i+1);
            System.out.println();
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        employeeId = sc.nextInt();
        Integer id = doesTheIdExist(list, employeeId);

        if (id == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            percentage = sc.nextDouble();
            list.get(id).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee employee: list) {
            System.out.println(employee);
        }


        sc.close();
    }

    public static Integer doesTheIdExist(List<Employee> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}