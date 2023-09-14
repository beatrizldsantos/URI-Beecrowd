package URI_JAVA;

import java.util.Locale;
import java.util.Scanner;
public class URI_1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf(Locale.US, "MEDIA = %.5f\n", media);
        sc.close();
    }
}
