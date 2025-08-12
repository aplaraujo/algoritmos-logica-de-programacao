package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		int N, i, code;
		
		System.out.print("How many students for course A? ");
		N = sc.nextInt();
		
		for(i = 0; i < N; i++) {
			code = sc.nextInt();
			set.add(new Student(code));
		}
		
		System.out.print("How many students for course B? ");
		N = sc.nextInt();
		
		for(i = 0; i < N; i++) {
			code = sc.nextInt();
			set.add(new Student(code));
		}
		
		System.out.print("How many students for course C? ");
		N = sc.nextInt();
		
		for(i = 0; i < N; i++) {
			code = sc.nextInt();
			set.add(new Student(code));
		}
		
		System.out.println("Total students: " + set.size());
	}

}
