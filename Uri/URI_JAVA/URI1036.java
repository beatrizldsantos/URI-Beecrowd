package URI_JAVA;
import java.util.Scanner;
import java.util.Locale;
public class URI1036 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner ler = new Scanner(System.in);
        double a, b, c, x1, x2, delta, raizDelta;

        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        //delta = (b*b) - 4 * a * c;
        if (delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }
        else {
            raizDelta = Math.sqrt(delta);
            x1 = (-b + raizDelta)/(2 * a);
            x2 = (-b - raizDelta)/(2 * a);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
        ler.close();
    }
}
