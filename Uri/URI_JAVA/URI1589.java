import java.util.Scanner;

public class URI1589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int S = R1 + R2;
            System.out.println(S);
        }
    }
}