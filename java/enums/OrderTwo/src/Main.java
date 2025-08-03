import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, quantity;
        String name, email, birthDate, status, productName;
        double productPrice;

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Email: ");
        email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        birthDate = sc.next();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        status = sc.next();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, sdf.parse(birthDate)));

        System.out.print("How many items to this order? ");
        N = sc.nextInt();

        for(i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " item data: ");
            sc.nextLine();
            System.out.print("Product name: ");
            productName = sc.nextLine();
            System.out.print("Product price: ");
            productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println(order);

        sc.close();
    }
}