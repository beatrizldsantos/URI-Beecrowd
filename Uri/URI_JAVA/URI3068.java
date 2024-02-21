package URI_JAVA;
import java.util.Scanner;
// Com erro

public class URI3068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teste = 1;

        while (true) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }

            int n = sc.nextInt();
            int count = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x >= x1 && x <= x2 && y >= y2 && y <= y1) {
                    count++;
                }
            }
            System.out.println("Teste " + teste);
            System.out.println(count);
            System.out.println();

            teste++;
        }

        sc.close();
    }
}
