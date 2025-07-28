import entities.Aluguel;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, room;
        String name, email;

        Aluguel[] rooms = new Aluguel[10];

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ": ");
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Room: ");
            room = sc.nextInt();

            rooms[room] = new Aluguel(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(i = 1; i <= 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
