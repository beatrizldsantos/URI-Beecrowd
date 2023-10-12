import java.util.Scanner;

public class URI2455 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P1 = scanner.nextInt();
        int C1 = scanner.nextInt();
        int P2 = scanner.nextInt();
        int C2 = scanner.nextInt();

        int ladoEsquerdo = P1 * C1;
        int ladoDireito = P2 * C2;

        if (ladoEsquerdo == ladoDireito) {
            System.out.println("0");
        } else if (ladoEsquerdo < ladoDireito) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }
}
