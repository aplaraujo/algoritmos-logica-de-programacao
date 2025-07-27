public class Fibonacci {
    private final int num;

    public Fibonacci(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void sequencia() {
        int anterior, atual, proximo, i;
        anterior = 0;
        atual = 1;
        i = 1;
        System.out.println("Sequência de Fibonacci até " + num + ":");
        while(i <= num) {
            proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
            i++;
        }
        System.out.println();
    }

}
