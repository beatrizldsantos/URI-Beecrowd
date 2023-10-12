import java.util.Scanner;

public class URI3346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f1, f2;
        f1 = scanner.nextDouble();
        f2 = scanner.nextDouble();

        double resultado = ((100.00 + f1) * (f2 / 100.00 + 1) - 100.00);

        System.out.printf("%.6f%n", resultado);
    }
}