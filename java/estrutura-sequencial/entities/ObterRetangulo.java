package entities;

public class ObterRetangulo {
    public double base;
    public double altura;

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base * altura);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public String toString() {
        return "AREA = " 
        + String.format("%.4f%n", area()) 
        + "PERIMETRO = " + String.format("%.4f%n", perimetro())
        + "DIAGONAL = " + String.format("%.4f%n", diagonal());
    }
}
