class Questao4{

	public static void main(String[] args){
		final int AREA_1 = 1; // apenas um cenario possivel para a primeira area
		final int AREA_2 = 3; // três possiveis variacoes possiveis para a segunda area
		final int AREA_4 = 2; // duas variacoes possiveis para a quarta area
		
		// Primeiro caso: Nao entra pela saida da Area 3
		int area_3 = 2; // duas variacoes possiveis para a terceira Area no 1º caso
		
		final int caso_1 = AREA_1 * AREA_2 * area_3 * AREA_4;

		// Segundo caso: Entra pela saida da Area 3 e consequentemente nao acessa a Area 4
		area_3 = 1;
		
		final int caso_2 = AREA_1 * AREA_2 * area_3;

		// A resposta final é o somatório das diferentes variacoes possiveis em cada caso
		final int qtd_variacoes_possiveis = caso_1 + caso_2;

		System.out.println(qtd_variacoes_possiveis);		
	}

}