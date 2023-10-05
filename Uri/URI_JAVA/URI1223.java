import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        x = y = 0;
    }

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    double dist(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}

class Line {
    int a, b, c;
    Point pt1, pt2;

    Line() {
        a = b = c = 0;
    }

    Line(Point _pt1, Point _pt2) {
        pt1 = _pt1;
        pt2 = _pt2;
        a = pt1.y - pt2.y;
        b = pt2.x - pt1.x;
        c = pt1.x * pt2.y - pt1.y * pt2.x;
    }

    double distPt(Point p) {
        return Math.abs(a * p.x + b * p.y + c) / Math.sqrt(a * a + b * b);
    }
}

public class URI1223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAXN = 1005;
        int inf = 100000;

        Line[] linha = new Line[MAXN];

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int l = scanner.nextInt();
            int h = scanner.nextInt();
            double ans, aux;

            for (int i = 1; i <= n; ++i) {
                int yi = scanner.nextInt();
                int xf = scanner.nextInt();
                int yf = scanner.nextInt();
                if (i % 2 == 1) {
                    linha[i] = new Line(new Point(0, yi), new Point(xf, yf));
                } else {
                    linha[i] = new Line(new Point(xf, yf), new Point(l, yi));
                }
            }

            ans = inf;
            for (int i = 1; i < n; ++i) {
                if (i % 2 == 1) {
                    if (linha[i].pt2.x < linha[i + 1].pt1.x)
                        ans = Math.min(ans, linha[i].pt2.dist(linha[i + 1].pt1));
                    else
                        ans = Math.min(ans, linha[i + 1].distPt(linha[i].pt2));
                    ans = Math.min(ans, Math.abs(linha[i].pt2.x - l));
                } else {
                    if (linha[i].pt1.x > linha[i + 1].pt2.x)
                        ans = Math.min(ans, linha[i].pt1.dist(linha[i + 1].pt2));
                    else
                        ans = Math.min(ans, linha[i + 1].distPt(linha[i].pt1));
                    ans = Math.min(ans, linha[i].pt1.x);
                }
            }

            if (n % 2 == 1)
                ans = Math.min(ans, Math.abs(linha[n].pt2.x - l));
            else
                ans = Math.min(ans, linha[n].pt1.x);
            System.out.printf("%.2f%n", ans);
        }

        scanner.close();
    }
}












