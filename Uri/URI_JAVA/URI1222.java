package URI_JAVA;
import java.util.Scanner;

public class URI1222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt(); // número de palavras
            int l = sc.nextInt(); // número máximo de linhas por página
            int c = sc.nextInt(); // número máximo de caracteres por linha
            sc.nextLine(); // consumir a quebra de linha após os inteiros

            String[] palavras = sc.nextLine().split(" ");

            int numPaginas = calcularNumPaginas(n, l, c, palavras);
            System.out.println(numPaginas);
        }

        sc.close();
    }
    private static int calcularNumPaginas(int n, int l, int c, String[] palavras) {
        int numPaginas = 1;
        int numLinhas = 1;
        int numCaracteres = 0;

        for (String palavra : palavras) {
            int tamanhoPalavra = palavra.length();

            if (numCaracteres == 0) {
                // primeira palavra da linha
                numCaracteres = tamanhoPalavra;
            } else {
                // já existe pelo menos uma palavra na linha
                numCaracteres += tamanhoPalavra + 1; // considerar um espaço entre as palavras
            }

            if (numCaracteres > c) {
                // a palavra atual não cabe na linha, começa uma nova linha
                numLinhas++;
                numCaracteres = tamanhoPalavra;

                if (numLinhas > l) {
                    // a nova linha não cabe na página, começa uma nova página
                    numPaginas++;
                    numLinhas = 1;
                }
            }
        }

        return numPaginas;
    }
}
