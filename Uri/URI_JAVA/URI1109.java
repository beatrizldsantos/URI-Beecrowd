// Código com runtime error para correção

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String regex;

        while (!(regex = br.readLine()).equalsIgnoreCase("EOF")) {
            int num = Integer.parseInt(br.readLine());
            String[] guarda = new String[num];

            for (int i = 0; i < num; i++) {
                String palavra = br.readLine();
                if (isRecognized(palavra, regex)) {
                    guarda[i] = "Y";
                } else {
                    guarda[i] = "N";
                }
            }

            for (String result : guarda) {
                bw.write(result);
                bw.write("\n");
            }
            bw.write("\n");
            bw.flush();
        }
    }

    private static boolean isRecognized(String palavra, String regex) {
        Stack<Character> stack = new Stack<>();
        int index = 0;

        while (index < regex.length()) {
            char currentChar = regex.charAt(index);

            if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                if (stack.isEmpty()) {
                    return false; // Parênteses desbalanceados
                }

                char top = stack.pop();
                if (top == 'a' || top == 'b') {
                    stack.push(currentChar);
                } else {
                    // Avaliar a expressão dentro dos parênteses
                    String subRegex = "";
                    while (top != '(') {
                        subRegex = top + subRegex;
                        if (stack.isEmpty()) {
                            return false; // Parênteses desbalanceados
                        }
                        top = stack.pop();
                    }

                    if (subRegex.startsWith("(a)") || subRegex.startsWith("(b)")) {
                        stack.push('a'); // Considera como 'a' para simplificar
                    } else {
                        // Avalia outras formas de expressões regulares aqui
                        return false;
                    }
                }
            } else {
                stack.push(currentChar);
            }

            index++;
        }

        if (stack.isEmpty()) {
            return false; // Parênteses desbalanceados
        }

        // Avalia a expressão final
        String finalRegex = "";
        while (!stack.isEmpty()) {
            finalRegex = stack.pop() + finalRegex;
        }

        return palavra.matches(finalRegex);
    }
}
