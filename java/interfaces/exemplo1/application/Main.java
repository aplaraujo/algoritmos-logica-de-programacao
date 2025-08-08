package exemplo1.application;

import exemplo1.model.entities.Values;
import exemplo1.model.services.Sum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        Sum s1 = new Values(a, b);
        
        System.out.println(s1);
        
        sc.close();
    }
}
