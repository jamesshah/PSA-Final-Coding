public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        if (n <= 2)
            return n;
        int a = 1;
        int b = 2;
        int c;
        for (int i = 3; i <= n; i++) {
            c = 2 * b + a;
            a = b;
            b = c;
        }
        return b;
    }
}
