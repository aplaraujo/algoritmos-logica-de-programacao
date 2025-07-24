package extra.util;

public class E2 {
    public static double valor;
    public static int taxa;
    public static int tempo;

    public static double obterPrestacao(double v, int tx, int t){
        return ((double) v + (v * (tx / 100.0) * t));
    }
}
