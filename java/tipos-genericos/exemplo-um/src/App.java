public class App {
    public static void main(String[] args) throws Exception {
        var box = new Box<String>("Hello");
        System.out.println(box.getItem().toUpperCase());

        var box2 = new Box<Integer>(5);
        System.out.println(box2.getItem());

        String[] arr1 = {"Exemplo 1", "Exemplo2"};
        Integer[] arr2 = {1, 2, 3, 4, 5};

        Util.printArray(arr1);
        Util.printArray(arr2);

        System.out.println(Calculadora.soma(1, 2));
        System.out.println(Calculadora.soma(1.5, 2.5));

    }
}
