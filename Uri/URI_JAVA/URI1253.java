import java.util.Locale;
import java.util.Scanner;

public class URI1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            int troca = sc.nextInt();
            sc.nextLine();

            String criptografado = criptografarString(str, troca);
            System.out.println(criptografado);
        }

        sc.close();
    }

    public static String criptografarString(String entrada, int troca) {
        char[] s = entrada.toCharArray();
        StringBuilder resultado = new StringBuilder();

        for (char c : s) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int deslocado = (c - base - troca + 26) % 26;
                resultado.append((char) (base + deslocado));
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
}
