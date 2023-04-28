package URI_JAVA;

import java.util.Scanner;
public class URI2890 {

    public final static int MOD = 1000007;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (true) {
            long n = leitor.nextLong();
            if (n == 0) break;
            long result = ((11 * pow2(n) + pow4(n)) % MOD) * inverso(12) % MOD;
            System.out.println(result);
        }
    }

    public static long pow2(long a) {
        long result = 1;
        for (long i = 0; i < 2; ++i) {
            result = (result * a) % MOD;
        }
        return result;
    }

    public static long pow4(long a) {
        long result = 1;
        for (long i = 0; i < 4; ++i) {
            result = (result * a) % MOD;
        }
        return result;
    }

    public static long inverso(long a) {
        long[] x = new long[1];
        long[] y = new long[1];
        long d = mdc(a, MOD, x, y);
        if (x[0] < 0) {
            x[0] = x[0] + MOD;
        }
        return x[0];
    }

    public static long mdc(long a, long b, long[] x, long[] y) {
        long[] xx = new long[1];
        long[] yy = new long[1];

        if (b == 0l) {
            x[0] = 1l;
            y[0] = 0l;
            return a;
        }

        long d = mdc(b, a % b, xx, yy);
        x[0] = yy[0];
        y[0] = xx[0] - (a / b) * yy[0];

        return d;
    }

}