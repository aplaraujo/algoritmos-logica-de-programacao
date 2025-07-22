import entities.ObterMedidas;
import java.util.Locale;
import java.util.Scanner;

public class Medidas {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      ObterMedidas medida = new ObterMedidas();

      System.out.print("Digite a medida A: ");
      medida.a = sc.nextDouble();
      System.out.print("Digite a medida B: ");
      medida.b = sc.nextDouble();
      System.out.print("Digite a medida C: ");
      medida.c = sc.nextDouble();


      System.out.println(medida);
   
      sc.close();
   } 
}
