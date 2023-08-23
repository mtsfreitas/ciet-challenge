using System;

namespace CIET
{
    class Questao1
    {

        static double CalcularTempoViagem(double dist_percorrer, double velocidade_km){
            double dias = dist_percorrer / velocidade_km;
            dias = dias / 24;
            return Math.Ceiling(dias);
            
        }

        static void Main(string[] args)
        {
            const double DistPercorrer = 149600000;
            const double VelocidadeKm = 28400;
            double tempo_viagem = CalcularTempoViagem(DistPercorrer , VelocidadeKm);
           

            Console.WriteLine(tempo_viagem);
            
        }
    }
}
