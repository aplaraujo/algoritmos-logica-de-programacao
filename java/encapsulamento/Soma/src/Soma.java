public class Soma {
    private int N;

    public Soma(int N) {
        this.N = N;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int obterSoma() {
        int cont, total;
        total = 0;
        for (cont = 1; cont <= N; cont++) {
            total = total + cont;
        }
        return total;
    }
}
