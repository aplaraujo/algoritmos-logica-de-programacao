package entities;

public class ObterDuracao {
    public int quantidade_segundos;

    public int hora() {
        return quantidade_segundos / 3600;
    }

    public int resto() {
        return quantidade_segundos % 3600;
    }

    public int minuto() {
        return resto() / 60;
    }

    public int segundo() {
        return resto() % 60;
    }

    @Override
    public String toString() {
        return hora() + ":" + minuto() + ":" + segundo();
    }
}
