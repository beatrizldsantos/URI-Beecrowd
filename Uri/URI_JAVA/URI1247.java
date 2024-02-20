package URI_JAVA;
import java.util.Scanner;

public class URI1247 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int D = scanner.nextInt();
            int VF = scanner.nextInt();
            int VG = scanner.nextInt();

            if (podeCapturarLadrao(D, VF, VG)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }

        scanner.close();
    }

    private static boolean podeCapturarLadrao(int D, int VF, int VG) {
        double distanciaGuardaCosteira = Math.sqrt(D * D + 144);
        double tempoFugitivo = 12.0 / VF;
        double tempoGuardaCosteira = distanciaGuardaCosteira / VG;

        return tempoGuardaCosteira <= tempoFugitivo;
    }
}
