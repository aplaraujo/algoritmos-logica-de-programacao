package entities;

public class ObterPagamento {
    public String nome;
    public double valor_hora;
    public int horas;

    public double salario() {
        return valor_hora * horas;
    }

    public String toString() {
        return "O pagamento para " + nome + " deve ser " + String.format("%.2f", salario());
    }
}
