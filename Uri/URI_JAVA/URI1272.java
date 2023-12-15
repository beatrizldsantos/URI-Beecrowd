import java.util.Scanner;

public class URI1272 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();
        scanner.nextLine(); 

        while (casos-- > 0) {

            String texto = scanner.nextLine();
            char[] resultado = new char[texto.length()];
            int i = 0;
            int j = 0;

            while (i < texto.length()) {
                if (texto.charAt(i) == ' ') {
                    i++;
                } else {
                    resultado[j++] = texto.charAt(i++);
                    while (i < texto.length() && Character.isLetter(texto.charAt(i))) {
                        i++;
                    }
                }
            }
            String resultadoString = new String(resultado, 0, j);
            System.out.println(resultadoString);
        }
    }
}
