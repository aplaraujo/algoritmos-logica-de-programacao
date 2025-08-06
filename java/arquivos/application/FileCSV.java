package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    public static void main(String[] args) {
        String path = "temp\\in.txt";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        
            String line = br.readLine();
            line = br.readLine();

            while (line != null) {
                String[] vet = line.split(",");
                String name = vet[0];
                Double price = Double.parseDouble(vet[1]);
                Integer quantity = Integer.parseInt(vet[2]);

                Product prod = new Product(name, price, quantity);
                list.add(prod);

                line = br.readLine();
            }
            System.out.println("PRODUCTS:");
            for(Product product:list) {
                System.out.println(product);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
