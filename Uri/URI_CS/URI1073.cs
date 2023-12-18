using System;

class URI
{
    static void Main()
    {
        int N = int.Parse(Console.ReadLine());

        if (N > 5 && N < 2000)
        {
            for (int i = 1; i <= N; i++)
            {
                if (i % 2 == 0)
                {
                    Console.WriteLine($"{i}^2 = {i * i}");
                }
            }
        }
    }
}
