using System;

namespace CIET
{
    class Questao4
    {
        static void Main(string[] args)
        {
            int a1, a2, a3_1, a3_2, a4;
            int possibilidade1, possibilidade2;

            a1= 1;
            a2= 3;
            a3_1= 2;
            a3_2= 1;
            a4 = 2;

            possibilidade1 = a1*a2*a3_1*a4;
            possibilidade2 = a1*a2*a3_2;


            Console.WriteLine(possibilidade1+possibilidade2);
         

        }
    }
}
