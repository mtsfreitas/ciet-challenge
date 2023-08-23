class Questao3{

	public static void main(String[] args){
		final double VELOCIDADE = 80.0; // em km/h
		final double ANGULO = 45.0; // em graus
		final double TEMPO = 5.0; // em segundos
		Questao3 q3 = new Questao3();

		double distancia_horizontal = q3.getDistanciaHorizontalPercorrida(VELOCIDADE, ANGULO, TEMPO);
		System.out.println(distancia_horizontal + " metros"); // em metros
	}	

	double getDistanciaHorizontalPercorrida(final double VELOCIDADE, final double ANGULO, final double TEMPO){
		double angulo_rad = ANGULO*Math.PI/180; // convertendo ANGULO para radianos
		double velocidade_ms = VELOCIDADE / 3.6; // convertendo VELOCIDADE para metros por segundo
		double velocidade_ms_horizontal = velocidade_ms * Math.cos(angulo_rad); // em m/s
		
		return velocidade_ms_horizontal * TEMPO;
	}

}