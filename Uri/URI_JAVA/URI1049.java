package URI;
import java.util.Scanner;

public class URI1049 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        String entrada1 = ler.next();
        String entrada2 = ler.next();
        String entrada3 = ler.next();


        if (entrada1.equals("vertebrado")&& entrada2.equals("ave") && entrada3.equals("carnivoro")) {
            System.out.println("aguia");
        }
        else if (entrada1.equals("vertebrado") && entrada2.equals("ave") && entrada3.equals("onivoro")) {
            System.out.println("pomba");
        }
        else if (entrada1.equals("vertebrado") && entrada2.equals("mamifero") && entrada3.equals("onivoro")){
            System.out.println("homem");
        }
        else if (entrada1.equals("vertebrado") && entrada2.equals("mamifero") && entrada3.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if (entrada1.equals("invertebrado") && entrada2.equals("inseto") && entrada3.equals("hematofago")){
            System.out.println("pulga");
        }
        else if (entrada1.equals("invertebrado") && entrada2.equals("inseto") && entrada3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if (entrada1.equals("invertebrado") && entrada2.equals("anelideo") && entrada3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (entrada1.equals("invertebrado") && entrada2.equals("anelideo") && entrada3.equals("onivoro")){
            System.out.println("minhoca");
        }
        ler.close();
    }
}

