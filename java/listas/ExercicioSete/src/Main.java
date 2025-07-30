import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Element> list = new ArrayList<Element>();

        int N, i;
        String searchName;

        System.out.print("How many names will be inserted? ");
        N = sc.nextInt();

        for(i = 0; i < N; i++) {
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            Element nameList = new Element(name);
            list.add(nameList);
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        for(Element name: list) {
            System.out.println(name.getName());
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        System.out.print("Search a name: ");
        searchName = sc.nextLine();
        String verifyName = doesTheNameExist(list, searchName);

        if (verifyName == null) {
            System.out.print("This name does not exist in the list!!! ");
        } else {
            System.out.print("This name exists in the list!!! ");
        }


    }

    public static String doesTheNameExist(List<Element> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i).getName(), name)) {
                return name;
            }
        }
        return null;
    }
}