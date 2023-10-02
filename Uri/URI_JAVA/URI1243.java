package URI_JAVA;
import java.util.Scanner;
public class URI1243 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String linha = readLine(leitor);
            String[] palavras = linha.split("");
            int countPalavras   = 0;
            int tamanhoPalavras = 0;
            for (String palavra : palavras) {
                boolean palavraValida = true;
                for (int i = 0; i < palavra.length(); i++) {
                    char c = palavra.charAt(i);
                    if (!Character.isAlphabetic(c) && !(c == '.' && i + 1 == palavra.length())) {
                        palavraValida = false;
                        break;
                    }
                }
                if (palavraValida) {
                    countPalavras++;
                    tamanhoPalavras += palavra.replace(".", "").length();
                }
            }
            if (countPalavras == 0 || tamanhoPalavras == 0)  {
                System.out.println(250);
            } else {
                int media = tamanhoPalavras / countPalavras;
                if      (media <= 3) System.out.println(250 );
                else if (media <= 5) System.out.println(500 );
                else                 System.out.println(1000);
            }
        }
    }
    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }

}