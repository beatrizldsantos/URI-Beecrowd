package URI_JAVA.URIJava;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados da peça 1
        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();

        // Leitura dos dados da peça 2
        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();

        // Cálculo do valor total a ser pago
        double valorTotal = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        // Exibição do resultado
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
