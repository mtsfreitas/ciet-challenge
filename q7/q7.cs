using System;

namespace CIET

{
    class Questao6
    {
        static void Main(string[] args)
        {
            double distancia = 0, velocidade = 260, coefAtrito = 1;
            distancia = (velocidade*velocidade)/250*coefAtrito;

            Console.WriteLine(distancia+" metros");
        
        }
    }
}
