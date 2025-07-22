import java.util.Scanner;

public class Duracao {
    public static int Obter_Hora(int s) {
        return s / 3600;
    }

    public static int Obter_Resto(int s) {
        return s % 3600;
    }

    public static int Obter_Minuto(int r) {
        return r / 60;
    }

    public static int Obter_Seg(int r) {
        return r % 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant_seg, hora, minuto, segundo, resto;

        System.out.print("Digite a duracao em segundos: ");
        quant_seg = sc.nextInt();

        hora = Obter_Hora(quant_seg);
        resto = Obter_Resto(quant_seg);
        minuto = Obter_Minuto(resto);
        segundo = Obter_Seg(resto);

        System.out.println(hora + ":" + minuto + ":" + segundo);

        sc.close();
    }
}
