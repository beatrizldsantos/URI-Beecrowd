import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class URI1248 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt();
        while (N-- > 0) {
            String diet = read();
            String foods = read() + read();
            if (canMaintainDiet(diet, foods)) {
                String sortedDiet = sortString(diet);
                out.println(sortedDiet);
            } else {
                out.println("CHEATER");
            }
        }
        out.close();
    }

    private static boolean canMaintainDiet(String diet, String foods) {
        HashMap<Character, Integer> dietMap = new HashMap<>();

        for (char food : diet.toCharArray()) {
            dietMap.put(food, dietMap.getOrDefault(food, 0) + 1);
        }
        for (char food : foods.toCharArray()) {
            if (dietMap.containsKey(food)) {
                dietMap.put(food, dietMap.get(food) - 1);
                if (dietMap.get(food) == 0) {
                    dietMap.remove(food);
                }
            }
        }

        return dietMap.isEmpty();
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }
}
