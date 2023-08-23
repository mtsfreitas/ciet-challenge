class Questao10{

	static final int NUMERO = 1969;

	public static void main(String[] args){
		long i = 1;
		/*
			Pelas informacoes do problema, um padrao pode ser identificado:
			O numero mais a direita da i-esima linha corresponde ao quadrado de i
			Dessa maneira, quando se alcancar o primeiro i tal que i ao quadrado
			é maior do NUMERO, entao NUMERO esta nessa linha.
		*/
		while(i*i < NUMERO){
			i++;
		}
		System.out.println(i);
	}

}