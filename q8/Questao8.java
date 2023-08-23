class Questao8{

	static final int QTD_DISCOS = 5;

	public static void main(String[] args){		
		System.out.println(getNumeroMinimoMovimentos(QTD_DISCOS));
	}

	static long getNumeroMinimoMovimentos(int qtd_discos){
		/*
			E possivel observar um padrao quando QTD_DISCOS = 1, 2, 3 e 4
			Indutivamente, o numero minimo de movimentos e dado por (2^QTD_DISCOS - 1)
		*/
		Double qtd_movimentos = Math.pow(2, qtd_discos) - 1;
		return qtd_movimentos.longValue();
	}

}