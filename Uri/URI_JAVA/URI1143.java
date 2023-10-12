import java.util.Scanner;

public class URI1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 1 && N < 1000) {

            for (int i = 1; i <= N; i++) {
                System.out.println(i + " " + i*i + " " + i*i*i);
            }
        } else {
            System.out.println("N fora do intervalo permitido.");
        }

        scanner.close();
    }
}
