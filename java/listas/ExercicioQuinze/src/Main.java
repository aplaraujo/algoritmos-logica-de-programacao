import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();

        list1.add("Fouli");
        list1.add("Tozog");
        list1.add("Caeki");
        list1.add("Sharzin");
        list1.add("Plama");
        list1.add("Rusi");
        list1.add("Rasadris");
        list1.add("Sega");
        list1.add("Quoso");
        list1.add("Poali");
        list1.add("Onra");

        List<String> list2 = new ArrayList<String>();

        list2.add("Civita");
        list2.add("Alos");
        list2.add("Bredo");
        list2.add("Bosiat");
        list2.add("Guici");
        list2.add("Suos");
        list2.add("Nilko");
        list2.add("Soili");
        list2.add("Cefea");
        list2.add("Soili");
        list2.add("Irazi");
        list2.add("Tius");

        System.out.println();
        System.out.println("----------- Lista 1 -----------------");
        System.out.println();

        for(String name: list1) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("----------- Lista 2 -----------------");
        System.out.println();

        for(String name: list2) {
            System.out.println(name);
        }

        // Juntar listas
        list1.addAll(list2);

        System.out.println();
        System.out.println("----------- Nova Lista -----------------");
        System.out.println();

        for(String name: list1) {
            System.out.println(name);
        }
    }
}