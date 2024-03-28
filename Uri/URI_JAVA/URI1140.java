package URI_JAVA;
import java.util.Scanner;

public class URI1140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String entrada = scanner.nextLine();
            
            if (entrada.equals("*")) {
                break;
            }
            
            String[] palavras = entrada.trim().toLowerCase().split(" ");
            char letra = palavras[0].charAt(0);
            boolean tautograma = true;
            
            for (String palavra : palavras) {
                if (palavra.charAt(0) != letra) {
                    tautograma = false;
                    break;
                }
            }
            
            if (tautograma) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        
        scanner.close();
    }
}
