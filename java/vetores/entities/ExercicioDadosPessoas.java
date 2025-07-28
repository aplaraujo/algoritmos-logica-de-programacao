package entities;

public class ExercicioDadosPessoas {
    private char genero;
    private double altura;

    public ExercicioDadosPessoas(char genero) {
        this.genero = genero;
    }

    public ExercicioDadosPessoas(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
