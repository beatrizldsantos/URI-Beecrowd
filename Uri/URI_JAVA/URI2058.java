package URI_JAVA;

import java.util.Scanner;

public class URI2058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long numeroMinimoTriangulos = (N - 2);

        System.out.println(numeroMinimoTriangulos);

        scanner.close();
    }
}
