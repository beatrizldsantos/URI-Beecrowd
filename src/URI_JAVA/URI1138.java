package URI_JAVA;
import java.util.Scanner;

public class URI1138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        while ((a = scanner.nextInt()) != 0 && (b = scanner.nextInt()) != 0) {
            for (int i = 0; i < 9; ++i)
                System.out.printf("%d ", solve(b, i) - solve(a - 1, i));
            System.out.printf("%d\n", solve(b, 9) - solve(a - 1, 9));
        }
    }
    public static int solve(int n, int d) {
        int ans, p, l, pv;
        p = 1;
        ans = l = pv = 0;

        while (n > 0) {
            int x = n % 10;
            n /= 10;
            ans += x * pv * p / 10;
            if (x > d)
                ans += p;
            else if (x == d)
                ans += l + 1;
            l += p * x;
            p *= 10;
            ++pv;
        }

        if (d == 0)
            ans -= (p - 1) / 9;

        return ans;
    }
}
