public class Fatorial {
    private int num;

    public Fatorial(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int calculaFatorial() {
        int fat = 1;
        int i = 1;

        while(i <= num) {
            fat *= i;
            i++;
        }
        return fat;
    }
}
