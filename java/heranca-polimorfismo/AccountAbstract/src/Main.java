import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<Account>();

        list.add(new SavingsAccount(1002, "Maria", 1000.00, 0.01));
        list.add(new BusinessAccount(1003, "Carlos", 1000.00, 500.00));
        list.add(new SavingsAccount(1004, "Teresa", 1000.00, 0.01));
        list.add(new BusinessAccount(1005, "Joao", 1000.00, 500.00));

        double sum = 0.0;
        for(Account account: list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for(Account account : list) {
            account.deposit(10.00);
        }

        for(Account account : list) {
            System.out.printf("Name: %s, Total balance: $ %.2f%n", account.getHolder(), account.getBalance());
        }
    }
}