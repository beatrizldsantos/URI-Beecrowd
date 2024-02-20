package URI_JAVA;
import java.util.Scanner;

public class URI1220 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d;

        while ((d = s.nextInt()) != 0) {
            double t = 0.0, r1 = 0.0, r2 = 0.0;
            double[] m = new double[d];

            for (int i = 0; i < d; i++) {
                m[i] = s.nextDouble();
                t += m[i];
            }

            double h = Math.floor((t / d + 0.0099) * 100.0) / 100.0;
            double l = Math.floor((t / d) * 100.0) / 100.0;

            for (int i = 0; i < d; i++) {
                if (m[i] > h) {
                    r1 += (m[i] - h);
                } else if (m[i] < l) {
                    r2 += (l - m[i]);
                }
            }

            if (r2 > r1) {
                System.out.printf("$%.2f\n", r2);
            } else {
                System.out.printf("$%.2f\n", r1);
            }
        }
    }
}
