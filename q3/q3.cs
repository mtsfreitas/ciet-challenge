using System;

namespace CIET
{
    class Questao3
    {
        static void Main(string[] args)
        {
            double velocidade = 80; //km/h
            double tempo = 5; //segundos
            double anguloRadianos, anguloGrau = 45;
            double distanciaBanana;        

            anguloRadianos = ((anguloGrau*Math.PI)/180);

            distanciaBanana = (((Math.Cos(anguloRadianos)*velocidade)/3.6)*tempo);
            Console.WriteLine(distanciaBanana+" metros");

        }
    }
}