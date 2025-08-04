import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        char response;
        String name, manufactureDate;
        double price, customsFee;
        Product product;
        List<Product> products = new ArrayList<Product>();

        System.out.print("Enter the number of products: ");
        N = sc.nextInt();

        for(i = 1; i <= N; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();

            if (response == 'i') {
                System.out.print("Customs fee: ");
                customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            } else if (response == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                manufactureDate = sc.next();
                product = new UsedProduct(name, price, sdf.parse(manufactureDate));
                products.add(product);
            } else {
                product = new Product(name, price);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product prod: products) {
            System.out.println(prod);
        }

        sc.close();
    }
}