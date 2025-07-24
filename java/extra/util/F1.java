package extra.util;

public class F1 {
    public int N;

    public int soma(int n) {
        int total, i;
        total = 0;

        for (i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }
}
