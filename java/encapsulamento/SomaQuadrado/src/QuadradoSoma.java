public class QuadradoSoma {
    private int A;
    private int B;
    private int C;

    public QuadradoSoma(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int soma() {
        return (A * A) + (B * B) + (C * C);
    }
}
