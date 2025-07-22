package entities;

public class ObterConsumo {
    public int distancia;
    public double combustivel;

    public double consumo() {
        return distancia / combustivel;
    }

    @Override
    public String toString() {
        return "Consumo medio = " + String.format("%.3f", consumo());
    }
}
