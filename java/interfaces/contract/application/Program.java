package contract.application;

import contract.application.model.entities.Contract;
import contract.application.model.entities.Installment;
import contract.application.model.services.ContractService;
import contract.application.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fm2);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, n);

        System.out.println("Parcelas:");
        for(Installment installment: obj.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
