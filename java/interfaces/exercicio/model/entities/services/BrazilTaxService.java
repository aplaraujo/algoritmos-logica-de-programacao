package exercicio.model.entities.services;

public class BrazilTaxService implements TaxService{
    public double tax(double amount) {
        return (amount <= 100) ? amount * 0.20 : amount * 0.15; 
    }
}
