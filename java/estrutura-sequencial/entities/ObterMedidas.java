package entities;

public class ObterMedidas {
    public double a;
    public double b;
    public double c;

    public double area_quadrado() {
        return Math.pow(a, 2);
    }

    public double area_triangulo() {
        return (a * b) / 2;
    }

    public double area_trapezio() {
        return ((a + b) * c) / 2;
    }

    @Override
    public String toString() {
        return "AREA DO QUADRADO = " + String.format("%.4f%n", area_quadrado())
        + "AREA DO TRIANGULO = " + String.format("%.4f%n", area_triangulo())
        + "AREA DO TRAPEZIO = " + String.format("%.4f", area_trapezio());
    }
}
