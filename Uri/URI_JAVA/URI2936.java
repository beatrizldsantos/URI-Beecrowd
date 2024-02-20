package URI_JAVA;
import java.util.Scanner;

public class URI2936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] porcoes = new int[5];
        int[] tamanhoPorcoes = { 300, 1500, 600, 1000, 150 };
        for (int i = 0; i < 5; i++) {
            porcoes[i] = sc.nextInt();
        }
        int totalMandioca = 225;
        for (int i = 0; i < 5; i++) {
            totalMandioca += porcoes[i] * tamanhoPorcoes[i];
        }
        System.out.println(totalMandioca);
        sc.close();
    }
}