package entities;

public class Salary {
   public String Name;
   public double GrossSalary;
   public double Tax;

   public double NetSalary() {
    return GrossSalary - Tax;
   }

   public void IncreaseSalary(double percentage) {
    this.GrossSalary += this.GrossSalary * (percentage / 100);
   }

   @Override
   public String toString() {
    return Name + " $ " + String.format("%.2f%n", NetSalary());
   }
}
