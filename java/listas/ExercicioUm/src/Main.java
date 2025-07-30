import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Orange");
        list.add("Yellow");

        for(String color : list) {
            System.out.println(color);
        }

    }
}