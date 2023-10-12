import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        int quantidadeDePares = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();

            if (valores[i] % 2 == 0) {
                quantidadeDePares++;
            }
        }

        System.out.println(quantidadeDePares + " valores pares");
    }
}