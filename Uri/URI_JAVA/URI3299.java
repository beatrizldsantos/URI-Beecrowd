package URI_JAVA;
import java.util.Scanner;

public class URI3299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        if (num.contains("13")) {
            System.out.println(num + " es de Mala Suerte");
        } else {
            System.out.println(num + " NO es de Mala Suerte");
        }
    }
}
