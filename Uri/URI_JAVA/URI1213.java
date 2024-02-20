package URI_JAVA;
import java.util.Scanner;
public class URI1213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int count = 1;
            int remainder = 1;
            while (remainder != 0) {
                remainder = (remainder * 10 + 1) % n;
                count++;}
            System.out.println(count);}
        scanner.close();}}