public class ParImpar {
    private int num;

    public ParImpar(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String parOuImpar() {
        String resultado;
        resultado = num % 2 == 0 ? "Esse número é par" : "Esse número é ímpar";
        return resultado;
    }
}
