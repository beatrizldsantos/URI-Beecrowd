package URI_JAVA;

import java.util.Scanner;

public class URI1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt(); // número de casos de teste

        for (int caso = 1; caso <= nc; caso++) {
            int n = sc.nextInt(); // número de pessoas no círculo
            int k = sc.nextInt(); // tamanho do salto

            int sobrevivente = 0;
            for (int i = 2; i <= n; i++) {
                sobrevivente = (sobrevivente + k) % i;
            }

            // adiciona 1 ao sobrevivente para ajustar para a numeração de 1 a n
            sobrevivente++;

            System.out.printf("Case %d: %d\n", caso, sobrevivente);
        }

        sc.close();
    }
}
