using System;
{
    class URI1002
    {
        static void Main(string[] args)
        {
            const double PI = 3.14159;
            double raio = Math.Round(Convert.ToDouble(Console.ReadLine()), 2);

            Console.WriteLine($"A={(PI * Math.Pow(raio, 2)).ToString("0.0000")}");
        }
    }
}
