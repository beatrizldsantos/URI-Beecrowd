using System;

class URI1118
{
    static void Main()
    {
        int X;
        do
        {
            double nota1, nota2;
            do
            {
                nota1 = double.Parse(Console.ReadLine());
                if (nota1 < 0 || nota1 > 10)
                {
                    Console.WriteLine("nota invalida");
                }
            } while (nota1 < 0 || nota1 > 10);

            do
            {
                nota2 = double.Parse(Console.ReadLine());
                if (nota2 < 0 || nota2 > 10)
                {
                    Console.WriteLine("nota invalida");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;
            Console.WriteLine($"media = {media:F2}");

            do
            {
                Console.WriteLine("novo calculo (1-sim 2-nao)");
                X = int.Parse(Console.ReadLine());
            } while (X < 1 || X > 2);
        } while (X == 1);
    }
}
