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
        list1.add("Civita");
        list1.add("Alos");
        list1.add("Bredo");
        list1.add("Bosiat");
        list1.add("Guici");
        list1.add("Suos");
        list1.add("Nilko");
        list1.add("Soili");
        list1.add("Cefea");
        list1.add("Soili");
        list1.add("Irazi");
        list1.add("Tius");

        List<String> list2 = new ArrayList<String>();

        list2.add("Fouli");
        list2.add("Tozog");
        list2.add("Caeki");
        list2.add("Sharzin");
        list2.add("Plama");
        list2.add("Rusi");
        list2.add("Rasadris");
        list2.add("Sega");
        list2.add("Quoso");
        list2.add("Poali");
        list2.add("Onra");
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
        System.out.println("-------------------------------------");
        System.out.println();

        // Comparar duas listas
        boolean areEqual = list1.equals(list2);

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Are the lists equal? " + areEqual);
    }
}