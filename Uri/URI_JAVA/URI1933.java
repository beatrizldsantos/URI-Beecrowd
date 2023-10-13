import java.io.IOException;
import java.util.Scanner;

public class URI1933 {
    public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C;
		if (A == B) C = A;
		else if (A > B) C = A;
		else C = B;
		System.out.println(C);
    }
	
}
