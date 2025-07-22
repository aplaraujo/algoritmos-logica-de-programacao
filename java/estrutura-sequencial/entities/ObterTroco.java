package entities;

public class ObterTroco {
    public double preco;
    public double total;
    public double dinheiro;
    public int quantidade;

    public double total() {
        return ((double) preco * quantidade);
    }

    public double troco() {
        return dinheiro - total();
    }

    @Override
    public String toString() {
        return "TROCO = " + String.format("%.2f", troco());
    }
}
