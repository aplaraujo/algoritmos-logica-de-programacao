package exercise.application;

import application.entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "..\\..\\out\\product.txt";

        String newDocument = "..\\..\\out\\summary.csv";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] vet = line.split(",");
                String name = vet[0];
                Double price = Double.parseDouble(vet[1]);
                Integer quantity = Integer.parseInt(vet[2]);
                Product prod = new Product(name, price, quantity);
                prod.totalPrice();
                list.add(prod);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newDocument))) {
            for (Product prod : list) {
                bw.write(prod.toString());
                bw.newLine();
            }

            for(Product prod: list) {
                System.out.println(prod);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
