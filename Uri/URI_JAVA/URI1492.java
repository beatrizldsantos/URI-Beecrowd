package URI_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class URI1492 {

public static long[][][] dp = new long[60][60][2];
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
        long a = leitor.nextLong();
        long b = leitor.nextLong();
        a--;

        memset(dp, -1);
        long ans = go(b, 55, 0, true);
        memset(dp, -1);

        ans -= go(a, 55, 0, true);
        System.out.println(ans);
        }
        }

public static long go(long n, int i, int acc, boolean top) {
        if (i == -1)
        return acc;

        if (dp[i][acc][top ? 1 : 0] != -1)
        return dp[i][acc][top ? 1 : 0];

        long ans = go(n, i - 1, acc, !(((n >> i) & 1L) != 0) && top);
        if (!top || ((n >> i) & 1) != 0)
        ans += go(n, i - 1, acc + 1, ((n >> i) & 1L) != 0 && top);

        return dp[i][acc][top ? 1 : 0] = ans;
        }

public static void memset(long[][][] array, int value) {
        for (long[][] dps1 : array) {
        for (long[] dps2 : dps1) {
        Arrays.fill(dps2, -1);
        }
        }
        }

        }