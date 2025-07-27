public class Real {
    private double dolar;

    public Real(double dolar) {
        this.dolar = dolar;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double dolarParaReal() {
        return dolar * 5.00;
    }
}
