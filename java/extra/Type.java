package extra;

public class Type {
    public static void main(String[] args) {
        System.out.println(TypeUtils.typeof("Hello"));
        System.out.println(TypeUtils.typeof(42));
        System.out.println(TypeUtils.typeof(3.14));
        System.out.println(TypeUtils.typeof(true));
        System.out.println(TypeUtils.typeof(null));
    }

}
