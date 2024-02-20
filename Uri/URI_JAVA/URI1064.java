package URI_JAVA;
import java.util.Scanner;
public class URI1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[6];
        int numPositives = 0;
        double sumPositive = 0.0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
            if (nums[i] > 0) {
                numPositives++;
                sumPositive += nums[i];
            }
        }

        double avgPositive = sumPositive / numPositives;

        System.out.println(numPositives + " valores positivos");
        System.out.printf("%.1f%n", avgPositive);

        sc.close();
    }
}
