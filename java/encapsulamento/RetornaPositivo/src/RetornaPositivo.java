public class RetornaPositivo {
    private int num;

    public RetornaPositivo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int verificaPositivo() {
        return num > 0 ? num : num * (-1);
    }
}
