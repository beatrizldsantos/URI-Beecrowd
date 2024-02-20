package URI_JAVA;
import java.util.*;

public class URI1141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            List<String> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strings.add(scanner.next());
            }

            int resultado = maiorSequencia(strings);
            System.out.println(resultado);
        }

        scanner.close();
    }

    public static int maiorSequencia(List<String> palavras) {
        Collections.sort(palavras, (p1, p2) -> Integer.compare(p1.length(), p2.length()));
        int n = palavras.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (palavras.get(i).contains(palavras.get(j))) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maximaSequencia = 0;
        for (int comprimento : dp) {
            maximaSequencia = Math.max(maximaSequencia, comprimento);
        }

        return maximaSequencia;
    }
}
