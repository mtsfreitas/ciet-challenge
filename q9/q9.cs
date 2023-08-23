using System;

namespace CIET

{
    class Questao9
    {
        static void Main(string[] args)
        {

          int setores = 8;
          double cidadeMidgar = 2827.43, centroCidade = 314.15, areaDeBusca=0;

          areaDeBusca = cidadeMidgar/setores - centroCidade/setores;
          Console.WriteLine(Math.Round(areaDeBusca,2)+" m²");

        }
    }
}