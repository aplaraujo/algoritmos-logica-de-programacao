public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return customsFee + price;
    }

    @Override
    public String priceTag() {
        return String.format("%.2f", totalPrice());
    }

    @Override
    public String toString() {
        return super.getName() + " $" + priceTag() + String.format(" (Customs fee: $ %.2f)", customsFee);
    }
}
