#include <stdio.h>
#include <math.h>

#define MAXN 1005
#define inf 1e5

struct Point {
    int x, y;
};

struct Line {
    int a, b, c;
    struct Point pt1, pt2;
};

struct Line linha[MAXN];

long double dist(struct Point p1, struct Point p2) {
    return sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
}

long double distPt(struct Line l, struct Point p) {
    return fabs(l.a * p.x + l.b * p.y + l.c) / sqrt(l.a * l.a + l.b * l.b);
}

int main() {
    int n, l, h, yi, xf, yf;
    long double ans;
    
    while (scanf("%d", &n) == 1) {
        scanf("%d %d", &l, &h);
        for (int i = 1; i <= n; ++i) {
            scanf("%d %d %d", &yi, &xf, &yf);
            if (i & 1) {
                linha[i].pt1.x = 0;
                linha[i].pt1.y = yi;
                linha[i].pt2.x = xf;
                linha[i].pt2.y = yf;
                linha[i].a = linha[i].pt1.y - linha[i].pt2.y;
                linha[i].b = linha[i].pt2.x - linha[i].pt1.x;
                linha[i].c = linha[i].pt1.x * linha[i].pt2.y - linha[i].pt1.y * linha[i].pt2.x;
            } else {
                linha[i].pt1.x = xf;
                linha[i].pt1.y = yf;
                linha[i].pt2.x = l;
                linha[i].pt2.y = yi;
                linha[i].a = linha[i].pt1.y - linha[i].pt2.y;
                linha[i].b = linha[i].pt2.x - linha[i].pt1.x;
                linha[i].c = linha[i].pt1.x * linha[i].pt2.y - linha[i].pt1.y * linha[i].pt2.x;
            }
        }
        ans = inf;
        for (int i = 1; i < n; ++i) {
            if (i & 1) {
                if (linha[i].pt2.x < linha[i + 1].pt1.x)
                    ans = fmin(ans, dist(linha[i].pt2, linha[i + 1].pt1));
                else
                    ans = fmin(ans, distPt(linha[i + 1], linha[i].pt2));
                ans = fmin(ans, (long double)fabs(linha[i].pt2.x - l));
            } else {
                if (linha[i].pt1.x > linha[i + 1].pt2.x)
                    ans = fmin(ans, dist(linha[i].pt1, linha[i + 1].pt2));
                else
                    ans = fmin(ans, distPt(linha[i + 1], linha[i].pt1));
                ans = fmin(ans, (long double)linha[i].pt1.x);
            }
        }
        if (n & 1)
            ans = fmin(ans, (long double)fabs(linha[n].pt2.x - l));
        else
            ans = fmin(ans, (long double)linha[n].pt1.x);
        printf("%.2Lf\n", ans);
    }

    return 0;
}
