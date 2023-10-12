import java.util.Scanner;

public class URI1943 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int K = input.nextInt();
            int category = getCategory(K);
            System.out.println("Top " + category);
        }

        input.close();
    }

    public static int getCategory(int K) {
        if (K == 1) return 1;
        if (K <= 3) return 3;
        if (K <= 5) return 5;
        if (K <= 10) return 10;
        if (K <= 25) return 25;
        if (K <= 50) return 50;
        return 100;
    }
}
