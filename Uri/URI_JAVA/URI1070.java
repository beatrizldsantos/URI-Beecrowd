package URI_JAVA;
import java.util.Scanner;
public class URI1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int x = scanner.nextInt();

        int contador = 0;
        int numeroImpar = x;

        while (contador < 6) {
            if (numeroImpar % 2 != 0) {
                System.out.println(numeroImpar);
                contador++;
            }
            numeroImpar++;
        }
        scanner.close();
    }
}
