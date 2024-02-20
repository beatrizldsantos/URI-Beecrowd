package URI_JAVA;
import java.util.Scanner;
import java.util.Stack;

public class URI1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            char[] entrada = new char[n];
            char[] saida = new char[n];
            Stack<Character> pilha = new Stack<>();

            for (int i = 0; i < n; i++) {
                entrada[i] = scanner.next().charAt(0);
            }

            for (int i = 0; i < n; i++) {
                saida[i] = scanner.next().charAt(0);
            }

            int i = 0, j = 0;
            StringBuilder output = new StringBuilder();

            while (true) {
                if (!pilha.isEmpty() && j < n && pilha.peek() == saida[j]) {
                    pilha.pop();
                    output.append("R");
                    j++;
                } else if (i < n) {
                    pilha.push(entrada[i]);
                    output.append("I");
                    i++;
                } else {
                    break;
                }
            }

            if (pilha.isEmpty()) {
                System.out.println(output.toString());
            } else {
                System.out.println(output.toString() + " Impossible");
            }
        }
    }
}
