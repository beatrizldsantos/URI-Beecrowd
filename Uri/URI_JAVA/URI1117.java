import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double soma = 0;
        int contador = 0;
        
        while (contador < 2) {
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            } else {
                System.out.println("nota invalida");
            }
        }
        
        System.out.printf("media = %.2f\n", soma / 2);
        sc.close();
    }
}
