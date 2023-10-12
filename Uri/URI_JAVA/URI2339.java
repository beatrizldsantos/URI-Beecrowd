import java.util.Scanner;

public class URU2339 {
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
