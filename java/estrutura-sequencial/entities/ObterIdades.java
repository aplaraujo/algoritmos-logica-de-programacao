package entities;

public class ObterIdades {
    public String nome1;
    public String nome2;
    public int idade1;
    public int idade2;

    public double media() {
        return ((double) idade1 + idade2) / 2;
    }

    @Override
    public String toString() {
        return "A idade média de " + nome1 + " e " + nome2 + " é de " + media() + " anos";
    }
}
