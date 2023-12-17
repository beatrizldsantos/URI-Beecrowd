using System;

public class URI1047
{
    public static void Main()
    {
        int h1 = Convert.ToInt32(Console.ReadLine());
        int m1 = Convert.ToInt32(Console.ReadLine());
        int h2 = Convert.ToInt32(Console.ReadLine());
        int m2 = Convert.ToInt32(Console.ReadLine());
        int mt1 = (h1 * 60) + m1;
        int mt2 = (h2 * 60) + m2;
        int h24 = (24 * 60);
        int resultado = 0;
        if (mt2 > mt1)
        {
            resultado = mt2 - mt1;
            Console.WriteLine($"O JOGO DUROU {resultado / 60} HORA(S) E {resultado % 60} MINUTO(S)");
        }
        else if (mt1 > mt2)
        {
            resultado = (h24 - mt1) + mt2;
            Console.WriteLine($"O JOGO DUROU {resultado / 60} HORA(S) E {resultado % 60} MINUTO(S)");
        }
        else if (mt2 == mt1)
        {
            Console.WriteLine("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
    }
}
