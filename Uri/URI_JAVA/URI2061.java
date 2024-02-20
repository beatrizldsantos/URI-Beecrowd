package URI_JAVA;
import java.util.Scanner;

public class URI2061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAbas = sc.nextInt();
        int numeroAcoes = sc.nextInt();

        for (int i = 0; i < numeroAcoes; i++) {
            String acao = sc.next();

            if (acao.equalsIgnoreCase("fechou")) {
                numeroAbas++;
            } else if (acao.equalsIgnoreCase("clicou")) {
                numeroAbas--;
            }
        }

        System.out.println(numeroAbas);

        sc.close();
    }
}
