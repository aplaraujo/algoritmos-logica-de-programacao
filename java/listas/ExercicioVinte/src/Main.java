import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Fouli");
        list.add("Tozog");
        list.add("Caeki");
        list.add("Sharzin");
        list.add("Plama");
        list.add("Rusi");
        list.add("Rasadris");
        list.add("Sega");
        list.add("Quoso");
        list.add("Poali");
        list.add("Onra");
        list.add("Civita");
        list.add("Alos");
        list.add("Bredo");
        list.add("Bosiat");
        list.add("Guici");
        list.add("Suos");
        list.add("Nilko");
        list.add("Soili");
        list.add("Cefea");
        list.add("Soili");
        list.add("Irazi");
        list.add("Tius");

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        for(String name: list) {
            System.out.println(name);
        }

        // Aumentar a capacidade de uma lista

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Initial Capacity: " + list.size());

        list.ensureCapacity(500);

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Capacity after ensuring: " + list.size());

    }

}