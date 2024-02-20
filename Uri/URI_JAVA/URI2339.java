package URI_JAVA;
import java.util.Scanner;

public class URI2339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int competidores = scanner.nextInt();
        int folhasCompradas = scanner.nextInt();
        int folhasPorCompetidor = scanner.nextInt();

        boolean suficiente = folhasCompradas >= (competidores * folhasPorCompetidor);

        System.out.println(suficiente ? "S" : "N");

        scanner.close();
    }
}
