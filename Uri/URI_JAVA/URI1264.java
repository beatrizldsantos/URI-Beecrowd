package URI_JAVA;
import java.util.Scanner;

public class URI1264 {
    public static void main(String[] args) {
        int[] v = new int[123];
        int m, c, f, x = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 48; i < 58; i++) {
            v[i] = x;
            x++;
        }
        for (int i = 65; i < 91; i++) {
            v[i] = x;
            x++;
        }
        for (int i = 97; i < 123; i++) {
            v[i] = x;
            x++;
        }

        while (scanner.hasNext()) {
            String a = scanner.next();
            m = 0;
            f = 0;
            c = 0;

            if (a.charAt(0) == '-')
                a = a.substring(1);

            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                c = v[ch];
                f += c;
                if (c > m)
                    m = c;
            }

            if (f < 3) {
                System.out.println("2");
            } else {
                while (m < 62) {
                    if (f % m == 0) {
                        System.out.println(m + 1);
                        break;
                    }
                    m++;
                }
                if (m == 62) {
                    System.out.println("such number is impossible!");
                }
            }
        }

        scanner.close();
    }
}
