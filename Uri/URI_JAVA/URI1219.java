package URI_JAVA;
import java.util.Scanner;

public class URI1219 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double[] areas = calcAreas(a, b, c);
            System.out.printf("%.4f %.4f %.4f%n", areas[0], areas[1], areas[2]);
        }
    }

    public static double[] calcAreas(double a, double b, double c) {
        double[] result = new double[3];
        double raioCirculoInterno;
        double raioCirculoExterno, semiPerimetro;

        raioCirculoExterno = (a * b * c) / Math.sqrt((a + b + c) * (b + c - a) * (c + a - b) * (a + b - c));
        semiPerimetro = (a + b + c) / 2;

        result[1] = Math.sqrt(semiPerimetro * ((semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c)));
        raioCirculoInterno = result[1] / semiPerimetro;
        result[0] = (raioCirculoExterno * raioCirculoExterno * Math.PI) - result[1];
        result[2] = (raioCirculoInterno * raioCirculoInterno) * Math.PI;
        result[1] = result[1] - result[2];

        return result;
    }
}
