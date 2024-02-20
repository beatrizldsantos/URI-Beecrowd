package URI_JAVA;
import java.util.Scanner;

public class URI1198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            long soldadosHashmat = scanner.nextLong();
            long soldadosOponente = scanner.nextLong();

            long diferenca = Math.abs(soldadosHashmat - soldadosOponente);

            System.out.println(diferenca);
        }

        scanner.close();
    }
}