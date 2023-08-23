using System;
using System.Collections.Generic;

namespace CIET
{
    class Questao2
    {
        static void Main(string[] args)
        {
            int a, b; 
            
            //int N;
            //N =  Convert.ToInt32(Console.ReadLine());   
            const int N = 120;      

            List<int> array_qtd_n = new List<int>();

            for(a=2; a<N; a++)
            {    
                double a_raiz = Math.Sqrt(a);         
                for(b=2; b<a_raiz; b++){
                    if(a%b==0)
                        break;      //Se for divisível por um número anterior então ele não é primo. 
                }
                if(b>=a_raiz){
                    array_qtd_n.Add(a);                    
                }
            }
            array_qtd_n.ForEach(primo=> Console.Write(primo+" "));            
        }
    }
}
