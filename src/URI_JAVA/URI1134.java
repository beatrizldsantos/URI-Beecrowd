package URI_JAVA;

import java.util.Scanner;
public class URI1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        int cod = 0;

        do {
            cod = sc.nextInt();

            if (cod == 1) {
                alcool++;
            } else if (cod == 2) {
                gasolina++;
            } else if (cod == 3) {
                diesel++;
            }
        } while (cod != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}