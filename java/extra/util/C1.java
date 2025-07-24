package extra.util;

public class C1 {
   public double raio;
   public double altura;
   public final double PI = 3.14159;

   public double volume(double r, double a) {
       return PI * Math.pow(r, 2) * a;
   }
}
