package URI_JAVA;

import java.io.IOException;
import java.util.Scanner;

public class URI1958 {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
    }
}
	
