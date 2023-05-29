package URI_JAVA;
import java.util.Scanner;
public class URI1115 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float x = ler.nextFloat();
        float y = ler.nextFloat();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("Terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }
            x = ler.nextInt();
            y = ler.nextInt();
        }
    }
}