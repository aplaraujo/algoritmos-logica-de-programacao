package entities;

public class ObterTerreno {
    public double l;
    public double c;
    public double m;
    
    public double area() {
        return l * c;
    }

    public double preco() {
        return area() * m;
    }

    @Override
    public String toString() {
        return "Area do terreno = " + String.format("%.2f %n", area()) + "Preco do terreno = " + String.format("%.2f", preco());
    }
}
