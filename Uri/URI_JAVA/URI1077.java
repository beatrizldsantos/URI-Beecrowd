import java.util.Scanner;
import java.util.Stack;

public class URI1077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtsCasos = scanner.nextInt();
        scanner.nextLine();

        while (qtsCasos-- > 0) {
            String expressao = scanner.nextLine();
            String posfixa = infixaToPosfixa(expressao);
            System.out.println(posfixa);
        }
    }

    public static String infixaToPosfixa(String expressao) {
        StringBuilder posfixa = new StringBuilder();
        Stack<Character> pilha = new Stack<>();
        pilha.push('(');

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                posfixa.append(c);
            } else if (c == '(') {
                pilha.push(c);
            } else if (c == ')' || c == '\0') {
                while (pilha.peek() != '(') {
                    posfixa.append(pilha.pop());
                }
                pilha.pop();
            } else if (isOperator(c)) {
                while (true) {
                    char t = pilha.peek();
                    if (isOperator(t) && priority(c) <= priority(t)) {
                        posfixa.append(pilha.pop());
                    } else {
                        pilha.push(c);
                        break;
                    }
                }
            }
        }

        while (pilha.peek() != '(') {
            posfixa.append(pilha.pop());
        }

        return posfixa.toString();
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '^' || c == '/';
    }

    public static int priority(char c) {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        if (c == '(') return 0;
        return -1;
    }
}
