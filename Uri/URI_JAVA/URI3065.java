package URI_JAVA;
import java.util.Scanner;

public class URI3065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teste = 1;

        while (true) {
            int m = scanner.nextInt();
            if (m == 0) {
                break;
            }
            String expressao = scanner.next();

            int resultado = calcularExpressao(expressao);

            System.out.println("Teste " + teste);
            System.out.println(resultado);
            System.out.println();

            teste++;
        }

        scanner.close();
    }

    public static int calcularExpressao(String expressao) {
        int resultado = 0;
        int operando = 0;
        char operador = '+';

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (Character.isDigit(caractere)) {
                operando = operando * 10 + (caractere - '0');
            } else {
                if (operador == '+') {
                    resultado += operando;
                } else {
                    resultado -= operando;
                }

                operando = 0;
                operador = caractere;
            }
        }

        // Última operação
        if (operador == '+') {
            resultado += operando;
        } else {
            resultado -= operando;
        }

        return resultado;
    }
}
