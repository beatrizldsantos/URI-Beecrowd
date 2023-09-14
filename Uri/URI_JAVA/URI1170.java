package URI_JAVA;

import java.util.Locale;
import java.util.Scanner;

public class URI1170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            double c = sc.nextDouble();
            int contadias=0;

            while (c > 1) {
                c = c / 2;
                contadias++;
            }
            System.out.println(contadias + " dias");
        }
        sc.close();
    }
}