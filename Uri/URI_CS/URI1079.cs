using System;
class URI1079
{
    static void Main()
    {
        int N = int.Parse(Console.ReadLine());

        for (int i = 0; i < N; i++)
        {
            string[] valores = Console.ReadLine().Split(' ');
            double a = double.Parse(valores[0]);
            double b = double.Parse(valores[1]);
            double c = double.Parse(valores[2]);

            double mediaPonderada = (a * 2 + b * 3 + c * 5) / 10;

            Console.WriteLine(mediaPonderada.ToString("F1"));
        }
    }
}
