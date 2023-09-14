package URI;
import java.util.Scanner;

public class URI1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        while ((N = scanner.nextInt()) != 0) {
            int m = findJumpSize(N);
            System.out.println(m);
        }

        scanner.close();
    }

    private static int findJumpSize(int N) {
        int m = 1;

        while (true) {
            int currentRegion = 0;
            int regionsRemaining = N - 1;

            while (regionsRemaining > 0) {
                currentRegion = (currentRegion + m) % N;

                if (currentRegion == 12) {
                    break;
                }

                regionsRemaining--;

                if (currentRegion < 12) {
                    currentRegion--;
                }
            }

            if (currentRegion == 12) {
                return m;
            }

            m++;
        }
    }
}
