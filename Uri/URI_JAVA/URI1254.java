import java.util.Scanner;

public class URI1254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (scanner.hasNext()) {
            String tag = scanner.next();
            int num = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String string = scanner.nextLine();
            solve(tag, num, string, output);
        }

        System.out.print(output);
    }

    public static void solve(String tag, int num, String string, StringBuilder output) {
        int i = 0;
        int len = tag.length();

        while (i < string.length()) {
            while (i < string.length() && string.charAt(i) != '<') {
                output.append(string.charAt(i));
                i++;
            }

            while (i < string.length() && string.charAt(i) != '>') {
                if (Character.toUpperCase(string.charAt(i)) == Character.toUpperCase(tag.charAt(0))) {
                    if (string.regionMatches(true, i, tag, 0, len)) {
                        output.append(num);
                        i += len;
                    } else {
                        output.append(string.charAt(i));
                        i++;
                    }
                } else {
                    output.append(string.charAt(i));
                    i++;
                }
            }
        }

        output.append("\n");
    }
}
