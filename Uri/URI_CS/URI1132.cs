using System;

class URI1132
{
    static void Main()
    {
        int X = int.Parse(Console.ReadLine());
        int Y = int.Parse(Console.ReadLine());

        int inicio = Math.Min(X, Y);
        int fim = Math.Max(X, Y);

        int soma = 0;
        for (int i = inicio; i <= fim; i++)
        {
            if (i % 13 != 0)
            {
                soma += i;
            }
        }

        Console.WriteLine(soma);
    }
}
