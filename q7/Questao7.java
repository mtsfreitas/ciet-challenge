class Questao7{

	static final double VELOCIDADE = 260.0; // em km/h
	static final double COEFICIENTE_ATRITO = 1.0;

	public static void main(String[] args){		
		System.out.println(getDistanciaFrenagem(VELOCIDADE, COEFICIENTE_ATRITO));
	}

	static double getDistanciaFrenagem(double velocidade, double coeficiente_atrito){
		return velocidade*velocidade/(250*coeficiente_atrito);
	}
}