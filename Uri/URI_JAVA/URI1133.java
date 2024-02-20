package URI_JAVA;
import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }
        
        for (int i = X + 1; i < Y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
