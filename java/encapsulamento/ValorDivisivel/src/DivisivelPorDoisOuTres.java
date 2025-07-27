public class DivisivelPorDoisOuTres {
    private int num;

    public DivisivelPorDoisOuTres(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String verificaDivisivel() {
        return (num % 2 == 0 && num % 3 == 0) ? "Esse número é divisível por 2 e 3" : "Esse número não é divisível por 2 nem por 3";
    }
}
