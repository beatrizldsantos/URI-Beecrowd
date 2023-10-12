import java.util.Scanner;

public class URI1202 {
    static final int MOD = 1500;
    static final int MAXSIZE = 10100;
    static int[] f = new int[2100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fib();

        while (n > 0) {
            String bin = scanner.next();
            System.out.printf("%03d\n", f[binn(bin)]);
            n--;
        }
    }

    static int modexp(int a, int b) {
        int ans = 1;
        a = a % MOD;

        while (b > 0) {
            if ((b & 1) == 1)
                ans = (ans * a) % MOD;

            b >>= 1;
            a = (a * a) % MOD;
        }

        return ans;
    }

    static int binn(String n) {
        int ans = 0;
        int j = 0;

        for (int i = n.length() - 1; i >= 0; i--, j++) {
            if (n.charAt(i) == '1')
                ans = (ans + modexp(2, j)) % MOD;
        }

        return ans;
    }

    static void fib() {
        f[1] = f[2] = 1;

        for (int i = 3; i <= 2000; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % 1000;
        }
    }
}