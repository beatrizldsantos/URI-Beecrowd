package URI_JAVA;
import java.util.Scanner;
public class URI2791{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copo1 = sc.nextInt();
        int copo2 = sc.nextInt();
        int copo3 = sc.nextInt();
        int copo4 = sc.nextInt();
        int posicaoFeijao = 0;
        if (copo1 == 1) {posicaoFeijao = 1;
        } else if (copo2 == 1) {posicaoFeijao = 2;}
        else if (copo3 == 1) {posicaoFeijao = 3;}
        else if (copo4 == 1) {posicaoFeijao = 4;}
        System.out.println(posicaoFeijao);
    }
}