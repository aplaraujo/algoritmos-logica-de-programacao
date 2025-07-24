package extra.util;

public class F2 {
    public static int N;

    public static int soma(int n) {
        int total, i;
        total = 0;

        for (i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }
}
