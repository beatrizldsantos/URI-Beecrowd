import java.util.Scanner;

public class URI1124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int L, C, R1, R2;
            L = scanner.nextInt();
            C = scanner.nextInt();
            R1 = scanner.nextInt();
            R2 = scanner.nextInt();

            if (L == 0 && C == 0 && R1 == 0 && R2 == 0) {
                break;
            }

            double hip = Math.hypot(R1 - (L - R2), R1 - (C - R2));

            if (hip >= R1 + R2 && R1 * 2 <= L && R1 * 2 <= C && R2 * 2 <= L && R2 * 2 <= C) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }

        scanner.close();
    }
}
