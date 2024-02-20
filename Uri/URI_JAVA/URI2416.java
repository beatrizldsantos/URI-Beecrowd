package URI_JAVA;
import java.util.Scanner;

public class URI2416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long C = sc.nextLong();
        long N = sc.nextLong();

        long pontoTermino = (C % N);

        System.out.println(pontoTermino);

        sc.close();
    }
}