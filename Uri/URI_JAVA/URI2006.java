package URI_JAVA;
import java.util.Scanner;

public class URI2006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over
        String[] respostas = scanner.nextLine().split(" ");
        int num_acertos = 0;
        for (String resposta : respostas) {
            if (Integer.parseInt(resposta) == T) {
                num_acertos++;
            }
        }
        System.out.println(num_acertos);
    }
}
