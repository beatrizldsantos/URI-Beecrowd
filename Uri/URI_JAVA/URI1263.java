package URI_JAVA;
import java.util.Scanner;

public class URI1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int alliterationCount = countAlliterations(line);
            System.out.println(alliterationCount);
        }
        scanner.close();
    }
    private static int countAlliterations(String line) {
        String[] words = line.split(" ");
        int alliterationCount = 0;

        for (int i = 1; i < words.length; i++) {
            if (startsWithSameLetter(words[i], words[i - 1])) {
                alliterationCount++;

                while (i < words.length - 1 && startsWithSameLetter(words[i], words[i + 1])) {
                    i++;
                }
            }
        }

        return alliterationCount;
    }

    private static boolean startsWithSameLetter(String word1, String word2) {
        return word1.toLowerCase().charAt(0) == word2.toLowerCase().charAt(0);
    }
}
