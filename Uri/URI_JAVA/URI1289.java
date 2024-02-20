package URI_JAVA;
import java.util.Scanner;

public class URI1289 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();

        while (numTestCases-- > 0) {
            int n = scanner.nextInt();
            double p = scanner.nextDouble();
            int i = scanner.nextInt();

            double pn = exp(1 - p, n);
            double pi = exp(1 - p, i - 1);
            double r = pi;

            for (int j = 0; j < 10000; j++) {
                pi *= pn;
                r += pi;
            }

            System.out.printf("%.4f%n", r * p);
        }
    }

    private static double exp(double p, int k) {
        double r = 1;
        for (int i = 0; i < k; i++) {
            r *= p;
        }
        return r;
    }
}
