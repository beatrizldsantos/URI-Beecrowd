package URI_JAVA;
import java.util.Scanner;

public class URI3048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sequencia = new int[N];
        for (int i = 0; i < N; i++) {
            sequencia[i] = sc.nextInt();
        }

        int atual = sequencia[0];
        int i = 1;
        int consecutivos = 0;

        while (i < N) {
            int j;
            if (atual == 1) {
                for (j = i; j < N; j++) {
                    if (sequencia[j] == 2) {
                        break;
                    }
                }
                i = j;
                atual = 2;
            } else {
                for (j = i; j < N; j++) {
                    if (sequencia[j] == 1) {
                        break;
                    }
                }
                i = j;
                atual = 1;
            }
            consecutivos++;
        }
        System.out.println(consecutivos);
        sc.close();
    }
}