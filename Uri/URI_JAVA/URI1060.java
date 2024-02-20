package URI_JAVA;
import java.util.Scanner;
public class URI1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;

        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) {
                c++;
            }
        }
        System.out.printf("%d valores positivos\n", c);
    }
}