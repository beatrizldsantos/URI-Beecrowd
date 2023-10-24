import java.util.Scanner;

public class URI1257 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            int l = input.nextInt();
            input.nextLine();
            int total = 0;

            for (int j = 0; j < l; j++) {
                String linha = input.nextLine();
                total += calculateTotal(linha, j);
            }

            System.out.println(total);
        }
        input.close();
    }

    private static int calculateTotal(String linha, int j) {
        int total = 0;
        for (int k = 0; k < linha.length(); k++) {
            total += linha.charAt(k) - 65 + j + k;
        }
        return total;
    }
}
