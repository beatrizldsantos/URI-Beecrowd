package URI_JAVA;
import java.util.Scanner;

public class URI3095 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teste = 1;

        while (true) {
            int m = scanner.nextInt();
            if (m == 0) {
                break;
            }

            int resultado = 0;
            String operacao = "";

            for (int i = 0; i < m; i++) {
                int operando = scanner.nextInt();
                if (i == 0) {
                    resultado = operando;
                } else {
                    String operador = scanner.next();
                    if (operador.equals("+")) {
                        resultado += operando;
                    } else if (operador.equals("-")) {
                        resultado -= operando;
                    }
                }
            }

            System.out.println("Teste " + teste);
            System.out.println(resultado);
            System.out.println();

            teste++;
        }
    }
}
