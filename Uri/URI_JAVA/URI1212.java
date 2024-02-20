package URI_JAVA;
import java.util.Scanner;

public class URI1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number1 = scanner.next();
            String number2 = scanner.next();

            if (number1.equals("0") && number2.equals("0")) {
                break;
            }

            int carry = 0;
            int carryOperations = 0;

            int maxLength = Math.max(number1.length(), number2.length());

            for (int i = 0; i < maxLength; i++) {
                int digit1 = (i < number1.length()) ? number1.charAt(number1.length() - 1 - i) - '0' : 0;
                int digit2 = (i < number2.length()) ? number2.charAt(number2.length() - 1 - i) - '0' : 0;

                int sum = digit1 + digit2 + carry;

                if (sum >= 10) {
                    carry = 1;
                    carryOperations++;
                } else {
                    carry = 0;
                }
            }

            if (carryOperations == 0) {
                System.out.println("No carry operation.");
            } else if (carryOperations == 1) {
                System.out.println("1 carry operation.");
            } else {
                System.out.println(carryOperations + " carry operations.");
            }
        }

        scanner.close();
    }
}