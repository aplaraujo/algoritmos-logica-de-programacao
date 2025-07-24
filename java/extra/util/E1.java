package extra.util;

public class E1 {
    public double valor;
    public int taxa;
    public int tempo;

    public double obterPrestacao(double v, int tx, int t){
        return ((double) v + (v * (tx / 100.0) * t));
    }
}
