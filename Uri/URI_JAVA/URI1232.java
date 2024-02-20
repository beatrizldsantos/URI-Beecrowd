package URI_JAVA;
import java.util.Scanner;

public class URI1232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String sequence = scanner.next();
            int result = solve(sequence);
            System.out.println(result);
        }

        scanner.close();
    }

    public static int solve(String sequence) {
        char[] c = new char[54];
        char[] c2 = new char[54];
        char[] s = sequence.toCharArray();

        for (int i = 0; i < 54; i++) {
            c2[i] = c[i] = (char) ((i / 9) * 9 + 4);
        }

        for (int i = 1; ; i++) {
            for (char move : s) {
                move(c, move);
            }

            if (solved(c)) {
                return i;
            }
        }
    }

    public static void rotate(char[] c, int f) {
        char[] c2 = c.clone();

        for (int i = 0; i < 54; i++) {
            c[i] = c2[m[f][i]];
        }
    }

    public static void move(char[] c, char m) {
        switch (m) {
            case 'F':
                rotate(c, 0);
                break;
            case 'f':
                for (int i = 0; i < 3; i++) {
                    rotate(c, 0);
                }
                break;
            case 'L':
                rotate(c, 1);
                break;
            case 'l':
                for (int i = 0; i < 3; i++) {
                    rotate(c, 1);
                }
                break;
            case 'D':
                rotate(c, 2);
                break;
            case 'd':
                for (int i = 0; i < 3; i++) {
                    rotate(c, 2);
                }
                break;
            case 'R':
                rotate(c, 3);
                break;
            case 'r':
                for (int i = 0; i < 3; i++) {
                    rotate(c, 3);
                }
                break;
            case 'U':
                rotate(c, 4);
                break;
            case 'u':
                for (int i = 0; i < 3; i++) {
                    rotate(c, 4);
                }
                break;
            case 'B':
                rotate(c, 5);
                break;
            case 'b':
                for (int i = 0; i < 3; i++) {
                    rotate(c, 5);
                }
                break;
        }
    }

    public static boolean solved(char[] c) {
        for (int i = 0; i < 54; i++) {
            if (c[i] != (char) ((i / 9) * 9 + 4)) {
                return false;
            }
        }
        return true;
    }

    static int[][] m = {
        {6, 3, 0, 7, 4, 1, 8, 5, 2, 18, 19, 20, 12, 13, 14, 15, 16, 17, 27, 28, 29, 21, 22, 23, 24, 25, 26, 36, 37, 38, 30, 31, 32, 33, 34, 35, 9, 10, 11, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53},
        {44, 1, 2, 41, 4, 5, 38, 7, 8, 15, 12, 9, 16, 13, 10, 17, 14, 11, 0, 19, 20, 3, 22, 23, 6, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 51, 39, 40, 48, 42, 43, 45, 18, 46, 47, 21, 49, 50, 24, 52, 53},
        {0, 1, 2, 3, 4, 5, 17, 14, 11, 9, 10, 45, 12, 13, 46, 15, 16, 47, 24, 21, 18, 25, 22, 19, 26, 23, 20, 6, 28, 29, 7, 31, 32, 8, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 33, 30, 27, 48, 49, 50, 51, 52, 53},
        {0, 1, 20, 3, 4, 23, 6, 7, 26, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 47, 21, 22, 50, 24, 25, 53, 33, 30, 27, 34, 31, 28, 35, 32, 29, 8, 37, 38, 5, 40, 41, 2, 43, 44, 45, 46, 42, 48, 49, 39, 51, 52, 36},
        {29, 32, 35, 3, 4, 5, 6, 7, 8, 2, 10, 11, 1, 13, 14, 0, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 53, 30, 31, 52, 33, 34, 51, 42, 39, 36, 43, 40, 37, 44, 41, 38, 45, 46, 47, 48, 49, 50, 9, 12, 15},
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 42, 43, 44, 18, 19, 20, 21, 22, 23, 15, 16, 17, 27, 28, 29, 30, 31, 32, 24, 25, 26, 36, 37, 38, 39, 40, 41, 33, 34, 35, 51, 48, 45, 52, 49, 46, 53, 50, 47}
    };
}
