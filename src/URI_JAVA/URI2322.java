package URI_JAVA;
import java.util.Scanner;

public class URI2322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numeros = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            numeros[i] = scanner.nextInt();
        }
        int numeroFaltando = calcularNumeroFaltando(n, numeros);

        System.out.println(numeroFaltando);
    }

    public static int calcularNumeroFaltando(int n, int[] numeros) {
        int somaTotal = (n * (n + 1)) / 2;

        int somaPresentes = 0;
        for (int num : numeros) {
            somaPresentes += num;
        }

        int numeroFaltando = somaTotal - somaPresentes;

        return numeroFaltando;
    }
}