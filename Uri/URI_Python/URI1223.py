import math

class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    def dist(self, p):
        return math.sqrt((self.x - p.x) ** 2 + (self.y - p.y) ** 2)

class Line:
    def __init__(self, pt1=Point(), pt2=Point()):
        self.pt1 = pt1
        self.pt2 = pt2
        self.a = pt1.y - pt2.y
        self.b = pt2.x - pt1.x
        self.c = pt1.x * pt2.y - pt1.y * pt2.x

    def distPt(self, p):
        return abs(self.a * p.x + self.b * p.y + self.c) / math.sqrt(self.a ** 2 + self.b ** 2)

MAXN = 1005
inf = 1e5

linha = [Line() for _ in range(MAXN)]

while True:
    try:
        n = int(input())
        l, h = map(int, input().split())
        ans = inf

        for i in range(1, n + 1):
            yi, xf, yf = map(int, input().split())
            if i % 2 == 1:
                linha[i] = Line(Point(0, yi), Point(xf, yf))
            else:
                linha[i] = Line(Point(xf, yf), Point(l, yi))

        for i in range(1, n):
            if i % 2 == 1:
                if linha[i].pt2.x < linha[i + 1].pt1.x:
                    ans = min(ans, linha[i].pt2.dist(linha[i + 1].pt1))
                else:
                    ans = min(ans, linha[i + 1].distPt(linha[i].pt2))
                ans = min(ans, abs(linha[i].pt2.x - l))
            else:
                if linha[i].pt1.x > linha[i + 1].pt2.x:
                    ans = min(ans, linha[i].pt1.dist(linha[i + 1].pt2))
                else:
                    ans = min(ans, linha[i + 1].distPt(linha[i].pt1))
                ans = min(ans, linha[i].pt1.x)

        if n % 2 == 1:
            ans = min(ans, abs(linha[n].pt2.x - l))
        else:
            ans = min(ans, linha[n].pt1.x)

        print(f"{ans:.2f}")

    except EOFError:
        break
