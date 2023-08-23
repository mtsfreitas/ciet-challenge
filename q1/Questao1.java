class Questao1{
	
	public static void main(String[] args){
		Questao1 q1 = new Questao1();
		System.out.println(q1.resposta());
	}

	int resposta(){
		final double DISTANCIA = 149600000.0; // em km
		final double VELOCIDADE_MEDIA = 28440.0; // em km/h

		Double duracao_viagem = (DISTANCIA / VELOCIDADE_MEDIA); // em horas
		duracao_viagem = Math.ceil((duracao_viagem / 24)); // em dias necessários (teto)

		return duracao_viagem.intValue();
	}	

}