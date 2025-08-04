import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        char response;
        double width, height, radius;
        String color;
        List<Shape> list = new ArrayList<Shape>();

        System.out.print("Enter the number of shapes: ");
        N = sc.nextInt();

        for(i = 1; i <= N; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            response = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            color = sc.nextLine();
            if (response == 'r') {
                System.out.print("Width: ");
                width = sc.nextDouble();
                System.out.print("Height: ");
                height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(Color.valueOf(color), width, height);
                list.add(rectangle);
            } else {
                System.out.print("Radius: ");
                radius = sc.nextDouble();
                Circle circle = new Circle(Color.valueOf(color), radius);
                list.add(circle);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape: list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}