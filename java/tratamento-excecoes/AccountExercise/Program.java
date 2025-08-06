package AccountExercise;

import AccountExercise.model.entities.Account;
import java.util.Locale;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        Account acc = new Account(accNumber, name, initialBalance, withdrawLimit);
        acc.withdraw(amount);
        
        System.out.println(acc);        

        sc.close();
    }
}