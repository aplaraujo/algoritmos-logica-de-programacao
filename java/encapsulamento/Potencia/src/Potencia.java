public class Potencia {
    private int base;
    private int expoente;

    public Potencia(int base, int expoente) {
        this.base = base;
        this.expoente = expoente;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExpoente() {
        return expoente;
    }

    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }

    public int potencia() {
        int i, pot;
        i = 1;
        pot = 1;

        while(i <= expoente) {
            pot *= base;
            i++;
        }
        return pot;
    }
}
