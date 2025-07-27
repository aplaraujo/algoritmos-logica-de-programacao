public class CompraTotal {
    private int quantA;
    private double precoA;
    private int quantB;
    private double precoB;
    private int quant;
    private double preco;

    public CompraTotal(int quantA, double precoA, int quantB, double precoB) {
        this.quantA = quantA;
        this.precoA = precoA;
        this.quantB = quantB;
        this.precoB = precoB;
    }

    public CompraTotal(int quant, double preco) {
        this.quant = quant;
        this.preco = preco;
    }

    public int getQuantA() {
        return quantA;
    }

    public void setQuantA(int quantA) {
        this.quantA = quantA;
    }

    public double getPrecoA() {
        return precoA;
    }

    public void setPrecoA(double precoA) {
        this.precoA = precoA;
    }

    public int getQuantB() {
        return quantB;
    }

    public void setQuantB(int quantB) {
        this.quantB = quantA;
    }

    public double getPrecoB() {
        return precoB;
    }

    public void setPrecoB(double precoB) {
        this.precoB = precoB;
    }

    public double totalUmProduto(int quant, double preco) {
        return quant * (preco - (preco * 0.10));
    }

    public double totalDoisProdutos(int quant1, int quant2, double preco1, double preco2) {
        double tot1 = quant1 * (preco1 - (preco1 * 0.15));
        double tot2 = quant2 * (preco2 - (preco2 * 0.15));
        return tot1 + tot2;
    }
}
