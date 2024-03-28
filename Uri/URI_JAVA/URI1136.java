package URI_JAVA;
import java.util.*;
import java.io.*;

public class URI1136 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = br.readLine()).equals("0 0")) {
            String[] parts = line.split(" ");
            int N = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            boolean[] possible = new boolean[N + 1];
            int[] balls = new int[B];
            parts = br.readLine().split(" ");
            for (int i = 0; i < B; i++) {
                balls[i] = Integer.parseInt(parts[i]);
            }
            for (int i = 0; i < B; i++) {
                for (int j = 0; j < B; j++) {
                    possible[Math.abs(balls[i] - balls[j])] = true;
                }
            }
            boolean canAnnounceAll = true;
            for (int i = 0; i <= N; i++) {
                if (!possible[i]) {
                    canAnnounceAll = false;
                    break;
                }
            }
            System.out.println(canAnnounceAll ? "Y" : "N");
        }
    }
}
