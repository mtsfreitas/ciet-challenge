using System;

namespace CIET

{
    class Questao10
    {
        static void Main(string[] args)
        {
            int numero = 1969;
            
            //O ultimo numero de cada linha é a linha ao quadrado. Dessa forma, um numero dado esta na linha correspondente ao teto de sua raiz quadrada.
            Console.WriteLine(Math.Ceiling(Math.Sqrt(numero)));

        }
    }
}