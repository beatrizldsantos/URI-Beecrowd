package URI_JAVA;
import java.util.Scanner;

public class URI1262 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        String string;

        while (scanner.hasNext()) {
            string = scanner.next();
            k = scanner.nextInt();
            process(string, k);
        }
    }

    public static void process(String str, int n) {
        int i = 0, ans = 0, cnt = 0;

        while (i < str.length()) {
            if (str.charAt(i) == 'W') {
                ans++;
                i++;
            } else if (str.charAt(i) == 'R' && i + 1 < str.length() && str.charAt(i + 1) == 'W') {
                ans++;
                i++;
            } else if (str.charAt(i) == 'R' && i + 1 < str.length() && str.charAt(i + 1) == 'R') {
                while (i < str.length() && str.charAt(i) == 'R' && cnt < n) {
                    cnt++;
                    i++;
                }
                ans++;
                cnt = 0;
            } else {
                ans++;
                i++;
            }
        }

        System.out.println(ans);
    }
}
