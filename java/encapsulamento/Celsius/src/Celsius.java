public class Celsius {
    private double tempF;

    public Celsius(double tempF) {
        this.tempF = tempF;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public double tempC() {
        return ((tempF - 32) * 5) / 9;
    }
}
