
import entities.ObterTroco;
import java.util.Locale;
import java.util.Scanner;

public class Troco {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    ObterTroco troco;
    troco = new ObterTroco();

    System.out.print("Preço unitário do produto: ");
    troco.preco = sc.nextDouble();
    System.out.print("Quantidade comprada: ");
    troco.quantidade = sc.nextInt();
    System.out.print("Dinheiro recebido: ");
    troco.dinheiro = sc.nextDouble();

    System.out.println(troco);
    
    sc.close();
  }  
}
