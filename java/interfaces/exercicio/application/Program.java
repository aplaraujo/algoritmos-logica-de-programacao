package exercicio.application;

import exercicio.model.entities.CarRental;
import exercicio.model.entities.Vehicle;
import exercicio.model.entities.services.BrazilTaxService;
import exercicio.model.entities.services.RentalService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fm2);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fm2);

        CarRental rental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(rental);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", rental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", rental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", rental.getInvoice().getTotalPayment()));

        sc.close();
    }
}
