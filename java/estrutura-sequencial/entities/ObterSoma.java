package entities;

public class ObterSoma {
    public int x;
    public int y;

    public int soma() {
        return x + y;
    }

    @Override
    public String toString() {
        return "SOMA = " + String.format("%d", soma());
    }
}
