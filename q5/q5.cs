using System;

namespace CIET

{
    class Questao5
    {
        static void Main(string[] args)
        {
            int yoshiChoco = 200, yoshiCookie = 180, chocoCookie = 100, yoshiChocoCookie = 30;
            int yoshiIsland = 450, chocoIsland = 330, cookieMountain = 340;
            int yoshis = 1000, grupoA=0, grupoB=0, grupoC=0, yoshiUnliked=0, yoshiLiked=0;

            grupoA = (yoshiIsland) - (yoshiChocoCookie+(yoshiCookie - yoshiChocoCookie)+(yoshiChoco-yoshiChocoCookie)); //Yoshi's Island
            grupoB = (chocoIsland) - (yoshiChocoCookie+(yoshiChoco - yoshiChocoCookie)+(chocoCookie-yoshiChocoCookie)); //Chocolate Island
            grupoC = (cookieMountain) - (yoshiChocoCookie+(yoshiCookie - yoshiChocoCookie)+(chocoCookie-yoshiChocoCookie)); //Cookie Mountain

            yoshiLiked = grupoA+grupoB+grupoC;
            Console.WriteLine("Yoshis que gostam apenas de uma unica localidade: "+yoshiLiked);

            yoshiUnliked = yoshis - ((grupoA+yoshiChocoCookie+(yoshiCookie - yoshiChocoCookie)+(yoshiChoco-yoshiChocoCookie)+grupoB+(chocoCookie-yoshiChocoCookie))+grupoC);
            Console.WriteLine("Yoshis que nao gostam de nenhuma destas localidades: "+yoshiUnliked);
        
        }
    }
}
