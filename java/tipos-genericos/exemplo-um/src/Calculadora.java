public class Calculadora {
    public static <T extends Number> double soma(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
