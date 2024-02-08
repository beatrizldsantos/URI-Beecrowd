using System;

    class Program
    {
        static void Main(string[] args)
        {
            string num = Convert.ToString(Console.ReadLine());

            if (num.Contains("13")) {

                Console.WriteLine("{0} es de Mala Suerte",num);
            }
            else {
                Console.WriteLine("{0} NO es de Mala Suerte",num);
            }
        }    
} 
