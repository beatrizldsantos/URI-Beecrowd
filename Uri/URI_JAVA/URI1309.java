package URI_JAVA;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class URI1309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int dolares = scanner.nextInt();
            int centavos = scanner.nextInt();
            System.out.println(formatarMoeda(dolares, centavos));
        }
    }

    public static String formatarMoeda(int dolares, int centavos) {
        DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
        String valorFormatado = df.format(dolares + centavos / 100.0);
        return "$" + valorFormatado;
    }
}
