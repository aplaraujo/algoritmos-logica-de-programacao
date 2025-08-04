public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double taxPayment = super.getAnualIncome() < 20000.00 ? super.getAnualIncome() * 0.15 : super.getAnualIncome() * 0.25;
        double total = taxPayment - (healthExpenditures * 0.50);
        return total;
    }
}
