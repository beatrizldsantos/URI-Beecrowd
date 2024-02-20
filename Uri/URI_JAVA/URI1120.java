package URI_JAVA;

import java.util.Scanner;
    public class URI1120 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                int d = sc.nextInt();
                long n = sc.nextLong();
                if (d == 0 && n == 0) {
                    break;
                }

                String numStr = Long.toString(n);
                StringBuilder resultStr = new StringBuilder();
                for (int i = 0; i < numStr.length(); i++) {
                    if (numStr.charAt(i) - '0' != d) {
                        resultStr.append(numStr.charAt(i));
                    }
                }

                if (resultStr.length() == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(Long.parseLong(resultStr.toString()));
                }
            }
        }
    }