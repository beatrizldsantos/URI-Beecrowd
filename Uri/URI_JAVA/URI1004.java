package URI_JAVA;


import java.util.Scanner;

public class URI1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calcula o produto
        int prod = a * b;

        // Imprime o resultado
        System.out.println("PROD = " + prod);

        scanner.close();
    }
}
