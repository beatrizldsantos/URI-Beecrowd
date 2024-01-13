import java.util.Scanner;

public class URI1400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            if (n == 0 && m == 0 && k == 0) {
                break;
            }

            int p = 1;
            int s = 1;
            int curr = 0;

            while (true) {
                curr++;

                if (p == m && clap(curr)) {
                    k--;
                    if (k == 0) {
                        System.out.println(curr);
                        break;
                    }
                }

                p += s;

                if (p > n) {
                    p = n - 1;
                    s = -1;
                } else if (p == 0) {
                    p = 2;
                    s = 1;
                }
            }
        }
    }

    private static boolean clap(int n) {
        if (n % 7 == 0) {
            return true;
        }

        while (n > 0) {
            int r = n % 10;
            n /= 10;

            if (r == 7) {
                return true;
            }
        }

        return false;
    }
}
