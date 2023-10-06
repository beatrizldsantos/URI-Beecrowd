import java.util.Scanner;

public class URI2388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int distanciaTotal = 0;

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            int V = sc.nextInt();
            distanciaTotal += T * V;
        }

        System.out.println(distanciaTotal);
    }
}