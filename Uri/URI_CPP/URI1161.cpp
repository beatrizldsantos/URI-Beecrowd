#include <iostream>

long long fatorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * fatorial(n - 1);
}

int main() {
    int M, N;

    while (std::cin >> M >> N) {
        long long fatorialM = fatorial(M);
        long long fatorialN = fatorial(N);
        long long somaFatoriais = fatorialM + fatorialN;
        std::cout << somaFatoriais << std::endl;
    }

    return 0;
}
