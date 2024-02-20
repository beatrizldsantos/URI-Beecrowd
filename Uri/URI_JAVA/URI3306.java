package URI_JAVA;
import java.util.Scanner;
import java.util.Arrays;

public class URI3306 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int Q = input.nextInt();

        int[] lista = new int[N];
        for (int i = 0; i < N; i++) {
            lista[i] = input.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int ac = input.nextInt();
            int a = input.nextInt() - 1;
            int b = input.nextInt();

            if (ac == 1) {
                int v = input.nextInt();
                for (int j = a; j < b; j++) {
                    lista[j] += v;
                }
            } else if (ac == 2) {
                int[] listaTemp = Arrays.copyOfRange(lista, a, b);
                int mdc = listaTemp[0];
                for (int j = 1; j < listaTemp.length; j++) {
                    mdc = gcd(mdc, listaTemp[j]);
                }
                System.out.println(mdc);
            }
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
