import java.util.Scanner;

public class URI1308 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                long s = scanner.nextLong();
                long result = calculateResult(s);
                System.out.println(result);
            }
        }
    }

    private static long calculateResult(long s) {
        return (long) ((-1 + Math.sqrt(1 + 8 * s)) / 2);
    }
}
