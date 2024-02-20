package URI_JAVA;
import java.util.Scanner;

public class URI1281 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();

		for (int i = 0; i < N; i++) {
			double S = 0;
			int M = leitor.nextInt();

			String[] vNomeProduto = new String[M];
			double[] vPrecoProduto = new double[M];

			for (int k = 0; k < M; k++) {
				vNomeProduto[k] = leitor.next();
				vPrecoProduto[k] = leitor.nextDouble();
			}

			int P = leitor.nextInt();
			String[] vNomeProdutoX = new String[P];
			int[] vContagemProdutoX = new int[P];

			for (int j = 0; j < P; j++) {
				vNomeProdutoX[j] = leitor.next();
				vContagemProdutoX[j] = leitor.nextInt();
			}
			
			for (int l = 0; l < P; l++) {
				for (int m = 0; m < M; m++) {
					if (vNomeProduto[m].equalsIgnoreCase(vNomeProdutoX[l])) {
						S = (S + (vPrecoProduto[m]) * vContagemProdutoX[l]);
					}
				}
			}
			
			System.out.println(String.format("R$ %.2f", S));
		}
	}

}
