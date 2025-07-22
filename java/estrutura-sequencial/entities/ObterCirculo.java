package entities;

public class ObterCirculo {
    public double raio;

    public double area() {
        return 3.14159 * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.3f", area());
    }
}
