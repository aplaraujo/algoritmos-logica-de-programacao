//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account x = new Account(1001, "Joao", 1000.00);
        Account y = new SavingsAccount(1002, "Maria", 1000.00, 0.01);

        x.withdraw(200.00);
        y.withdraw(200.00);

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Saldo Joao: " + x.getBalance());
        System.out.println("Saldo Maria: " + y.getBalance());
        System.out.println("--------------------------------------");
        System.out.println();
    }
}