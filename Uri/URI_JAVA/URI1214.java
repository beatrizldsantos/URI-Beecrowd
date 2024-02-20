package URI_JAVA;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        DecimalFormat df = new DecimalFormat("0.000");

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int[] notas = new int[N];
            int soma = 0;

            for (int j = 0; j < N; j++) {
                notas[j] = sc.nextInt();
                soma += notas[j];
            }

            int media = soma / N;
            int acimaMedia = 0;

            for (int j = 0; j < N; j++) {
                if (notas[j] > media) {
                    acimaMedia++;
                }
            }

            double percentual = (acimaMedia * 100.0) / N;
            System.out.println(df.format(percentual) + "%");
        }

        sc.close();
    }
}
