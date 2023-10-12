import java.util.Scanner;

public class URI1163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        final double G = 9.80665;

        while (scanner.hasNextDouble()) {
            double h = scanner.nextDouble();
            int p1 = scanner.nextInt();
            int p2 = scanner.nextInt();
            int n = scanner.nextInt();

            double[] p1Results = new double[n];
            double[] p2Results = new double[n];

            for (int i = 0; i < n; i++) {
                double alfa = scanner.nextDouble();
                double v = scanner.nextDouble();

                alfa = alfa * PI / 180;
                double Vox = v * Math.cos(alfa);
                double Voy = v * Math.sin(alfa);

                double Ts = Voy / G;
                double H = (Voy * Voy) / (2 * G) + h;
                double Vfy = Math.sqrt(2 * G * H);
                double Td = Vfy / G;
                double Tt = Ts + Td;
                double D = Vox * Tt;

                p1Results[i] = D - p1;
                p2Results[i] = D - p2;
            }

            for (int i = 0; i < n; i++) {
                if (p1Results[i] > 0 && p2Results[i] < 0)
                    System.out.printf("%.5f -> DUCK%n", p1 + p1Results[i]);
                else
                    System.out.printf("%.5f -> NUCK%n", p1 + p1Results[i]);
            }
        }
    }
}