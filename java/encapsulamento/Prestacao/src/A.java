public class A {
    private double valor;
    private int taxa;
    private int tempo;

    public A(double valor, int taxa, int tempo) {
        this.valor = valor;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int valorTaxa) {
        taxa = valorTaxa;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int valorTempo) {
        tempo = valorTempo;
    }

    public double prestacao(double valor, int taxa, int tempo) {
        return valor + (valor * (taxa / 100.0) * tempo);
    }
}
