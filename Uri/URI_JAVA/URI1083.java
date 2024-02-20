package URI_JAVA;
import java.util.Scanner;
import java.util.Stack;

public class URI1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String infix = scanner.nextLine();
            String postfix = toPostfix(infix);

            if (postfix.equals("Lexical Error!") || postfix.equals("Syntax Error!")) {
                System.out.println(postfix);
            } else {
                System.out.println(postfix);
            }
        }
    }

    private static String toPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        int d = 0;
        int f = 0;

        for (int i = 0; i < infix.length(); i++) {
            if (prec(infix.charAt(i)) == 0) {
                d++;
                break;
            }
            if (infix.charAt(i) == '(') {
                f++;
            } else if (infix.charAt(i) == ')') {
                f--;
            }
        }

        for (int i = 1; i < infix.length(); i++) {
            int previous = prec(infix.charAt(i - 1));
            int present = prec(infix.charAt(i));
            if ((previous >= 1 && previous <= 6) && (present >= 1 && present <= 6)) {
                f++;
                break;
            }
            if (previous == 10 && present == 10) {
                f++;
                break;
            }
        }

        if (d != 0) {
            return "Lexical Error!";
        } else if (f != 0) {
            return "Syntax Error!";
        } else {
            for (int i = 0; i < infix.length(); ++i) {
                char symbol = infix.charAt(i);
                if (Character.isLetter(symbol)) {
                    postfix.append(symbol);
                } else if (symbol == '(') {
                    stack.push(symbol);
                } else if (symbol == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && stack.peek() != '(' && prec(symbol) <= prec(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(symbol);
                }
            }

            while (!stack.isEmpty()) {
                postfix.append(stack.pop());
            }

            return postfix.toString();
        }
    }

    static int prec(char x) {
        if (x == '|') return 1;
        if (x == '.') return 2;
        if (x == '>' || x == '<' || x == '=' || x == '#') return 3;
        if (x == '+' || x == '-') return 4;
        if (x == '*' || x == '/') return 5;
        if (x == '^') return 6;
        if (x == '(' || x == ')') return 7;
        if (((int) x >= 48 && (int) x <= 57) || ((int) x >= 65 && (int) x <= 90) || ((int) x >= 97 && (int) x <= 122))
            return 10;
        return 0;
    }
}
