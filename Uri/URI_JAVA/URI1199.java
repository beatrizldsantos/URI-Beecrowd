import java.util.Scanner;
public class URI1199{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("-1")) {
                break;}
            if (input.startsWith("0x")) {
                int decimalValue = Integer.parseInt(input.substring(2), 16);
                System.out.println(decimalValue);
            } else {
                int decimalValue = Integer.parseInt(input);
                String hexadecimalValue = "0x" + Integer.toHexString(decimalValue).toUpperCase();
                System.out.println(hexadecimalValue);
            }
        }
    }
}