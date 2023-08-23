using System;

namespace CIET

{
    class Questao8
    {
        static void Main(string[] args)
        {
            int n=5; //numero de discos
            Console.WriteLine(Math.Pow(2,n)-1); //Se n = 1, a resposta é 1; Se n = 2, a resposta é 3; Se n = 3, a resposta é 7; Se n = 4, a resposta é 15... 
                                                //Com isso, observa-se um padrão que corresponde a ((2^n)-1) o número minimo de movimentos.

        }
    }
}