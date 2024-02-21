package URI_JAVA;

import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String board = sc.next();

            // Verifica se Maria pode sempre ganhar
            boolean mariaWins = false;
            for (int i = 0; i <= n - 3; i++) {
                if (board.charAt(i) == '.' && board.charAt(i+1) == '.' && board.charAt(i+2) == '.') {
                    mariaWins = true;
                    break;
                }
            }

            // Imprime resultado
            System.out.println(mariaWins ? "S" : "N");
        }

        sc.close();
    }
}
