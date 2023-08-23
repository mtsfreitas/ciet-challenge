using System;
using System.Collections.Generic;

namespace CIET
{
    class Questao6
    {
        static void Main(string[] args)
        {
            List<string> combinacoesLetras = new List<string>();
            List<string> combinacoesDigitos = new List<string>();
            List<string> combinacoesSenhas = new List<string>();

            string[] letrasFaltando = { "B", "C", "E", "F" };
            int[] digitosIniciais = { 3, 6 };
            int somaNumeros=8;
            
            foreach (string letra in letrasFaltando){
                combinacoesLetras.Add("AD" + letra);   
                combinacoesLetras.Add("DA" + letra);   
                combinacoesLetras.Add("A" + letra + "D");   
                combinacoesLetras.Add("D" + letra + "A");
                combinacoesLetras.Add(letra + "AD");   
                combinacoesLetras.Add(letra + "DA");
            }

            foreach (int digito in digitosIniciais){
                int somaRestante = somaNumeros - digito;
                for(int segundoDigito=1; segundoDigito<somaRestante; segundoDigito++){
                    int terceiroDigito = somaNumeros-digito-segundoDigito;

                    combinacoesDigitos.Add(""+digito+segundoDigito+terceiroDigito);                    
                }                
            }

            foreach (string combinacaoLetra in combinacoesLetras)
            {
                foreach (string combinacaoDigito in combinacoesDigitos)
                {
                    combinacoesSenhas.Add(combinacaoLetra+combinacaoDigito);
                }
            }

            foreach (string combinacaoSenha in combinacoesSenhas)
            {
                Console.Write(combinacaoSenha+" ");
            }
            Console.WriteLine("\nTempo necessario em minutos: "+(combinacoesSenhas.Count*2)/60);

        }
    }
}