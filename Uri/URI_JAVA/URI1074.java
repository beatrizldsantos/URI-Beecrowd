import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            classifyNumber(X);
        }

        scanner.close();
    }

    public static void classifyNumber(int number) {
        if (number == 0) {
            System.out.println("NULL");
        } else {
            String parity = (number % 2 == 0) ? "EVEN" : "ODD";
            String sign = (number > 0) ? "POSITIVE" : "NEGATIVE";

            System.out.println(parity + " " + sign);
        }
    }
}
