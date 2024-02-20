import java.io.IOException;
import java.util.Scanner;

public class URI1399 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int u = sc.nextInt();
        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt(); 
        }

        for(int i=0; i<m; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int v = sc.nextInt();
            int p = sc.nextInt();
            int k = 0;

            for(int j=L; j<=R; j++){
                if(A[j-1] < v){
                    k += 1;
                }
            }

            A[p-1] = (int)Math.floor((double)u*k/(R - L + 1));
        }

        for(int i=0; i<n; i++){
            System.out.println(A[i]);
        }

        sc.close();
    }
}
