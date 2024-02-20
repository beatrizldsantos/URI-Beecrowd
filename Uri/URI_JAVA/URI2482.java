package URI_JAVA;
import java.util.HashMap;
import java.util.Scanner;

public class URI2482 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<String, String> idiomas = new HashMap<>();
		
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String idioma = readLine(leitor);
			String mensagemTraduzida = readLine(leitor);
			idiomas.put(idioma, mensagemTraduzida);
		}
		
		int M = leitor.nextInt();
		for (int i = 0; i < M; i++) {
			String crianca = readLine(leitor);
			String idioma = readLine(leitor); 
			String mensagemTraduzida = idiomas.get(idioma);
			System.out.println(crianca);
			System.out.println(mensagemTraduzida);
			System.out.println();
		}
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
}
