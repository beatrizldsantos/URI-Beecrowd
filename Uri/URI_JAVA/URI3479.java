package URI_JAVA;
import java.util.Scanner;

public class URI3479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String dataAniversario = scanner.next();
            String[] partes = dataAniversario.split("/");

            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);

            String signo = determinarSigno(dia, mes);
            System.out.println(signo);
        }

        scanner.close();
    }

    public static String determinarSigno(int dia, int mes) {
        String[] signos = {
            "aquario", "peixes", "aries", "touro", "gemeos", "cancer",
            "leao", "virgem", "libra", "escorpiao", "sagitario", "capricornio"
        };

        int[] limitesInferiores = { 20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22 };
        int mesIndex = mes - 1;

        if (dia < limitesInferiores[mesIndex]) {
            mesIndex = (mesIndex + 11) % 12;
        }

        return signos[mesIndex];
    }
}
