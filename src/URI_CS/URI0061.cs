using System;
using System.Numerics;

class URI {
    static void Main(string[] args) {
        while (true) {
            string line = Console.ReadLine();
            if (line == null) break; // Fim da entrada (EOF)

            string[] values = line.Split();
            int m = int.Parse(values[0]);
            int n = int.Parse(values[1]);

            BigInteger factorialM = Factorial(m);
            BigInteger factorialN = Factorial(n);
            BigInteger sum = factorialM + factorialN;

            Console.WriteLine(sum);
        }
    }

    static BigInteger Factorial(int n) {
        BigInteger result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
