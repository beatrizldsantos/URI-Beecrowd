package URI_JAVA;
import java.util.Scanner;

class Classe {
    String nome;
    int presenca;
    int ausencia;
    int atestado;
    double taxaPresenca;
}

public class URI1277 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int casos = scanner.nextInt();
        
        for (int caso = 0; caso < casos; caso++) {
            int qtsAlunos = scanner.nextInt();
            Classe[] alunos = new Classe[qtsAlunos];
            
            for (int i = 0; i < qtsAlunos; i++) {
                alunos[i] = new Classe();
                alunos[i].nome = scanner.next();
            }
            
            for (int i = 0; i < qtsAlunos; i++) {
                String registro = scanner.next();
                
                for (int j = 0; j < registro.length(); j++) {
                    char c = registro.charAt(j);
                    
                    if (c == 'P') {
                        alunos[i].presenca++;
                    } else if (c == 'A') {
                        alunos[i].ausencia++;
                    } else if (c == 'M') {
                        alunos[i].atestado++;
                    }
                }
                
                alunos[i].taxaPresenca = (1.0 * alunos[i].presenca) / (alunos[i].presenca + alunos[i].ausencia);
            }
            
            StringBuilder alunosComBaixaPresenca = new StringBuilder();
            
            for (int i = 0; i < qtsAlunos; i++) {
                if (alunos[i].taxaPresenca < 0.75) {
                    if (alunosComBaixaPresenca.length() > 0) {
                        alunosComBaixaPresenca.append(" ");
                    }
                    alunosComBaixaPresenca.append(alunos[i].nome);
                }
            }
            
            System.out.println(alunosComBaixaPresenca.toString());
        }
    }
}
