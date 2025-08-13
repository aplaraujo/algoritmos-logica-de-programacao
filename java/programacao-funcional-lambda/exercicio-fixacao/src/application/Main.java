package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import services.EmployeeService;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream().filter(emp -> emp.getSalary() > salary).map(emp -> emp.getEmail()).sorted(comp).collect(Collectors.toList());
			
			EmployeeService empServ = new EmployeeService();
			
			double totalSum = empServ.filteredSum(list, emp -> emp.getName().charAt(0) == 'M');
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ": ");
			emails.forEach(System.out::println);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", totalSum));
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
		sc.close();
	}

}
