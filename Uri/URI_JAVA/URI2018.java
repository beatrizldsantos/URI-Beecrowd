package URI_JAVA;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class URI2018 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<String, Equipe> equipes = new HashMap<>();
		
		while (leitor.hasNext()) {
			String modalidade = readLine(leitor); 
			for (int i = 0; i < 3; i++) {
				String nomeEquipe = readLine(leitor); 
				Equipe equipe;
				if (equipes.containsKey(nomeEquipe)) {
					equipe = equipes.get(nomeEquipe);
				} else {
					equipe = new Equipe(nomeEquipe);
					equipes.put(nomeEquipe, equipe);
				}
				equipe.medalhas[i]++;
			}
		}
		
		List<Equipe> listaEquipes = new ArrayList<>(equipes.values());
		Collections.sort(listaEquipes);
		
		System.out.println("Quadro de Medalhas");
		for (Equipe equipe : listaEquipes) {
			System.out.println(equipe);
		}
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
}

class Equipe implements Comparable<Equipe> {
	
	public String nome;
	public int[] medalhas;
	
	public Equipe(String nome) {
		this.nome = nome;
		this.medalhas = new int[3];
	}
		
	@Override
	public int compareTo(Equipe e) {
		if (this.medalhas[0] > e.medalhas[0]) 
			return -1;
		else if (this.medalhas[0] < e.medalhas[0])
			return 1;
		else if (this.medalhas[1] > e.medalhas[1])
			return -1;
		else if (this.medalhas[1] < e.medalhas[1])
			return 1;
		else if (this.medalhas[2] > e.medalhas[2])
			return -1;
		else if (this.medalhas[2] < e.medalhas[2])
			return 1;
		else
			return this.nome.compareTo(e.nome);
	}
	
	@Override
	public String toString() {
		return nome + " " + medalhas[0] + " " + medalhas[1] + " " + medalhas[2];
	}
}
