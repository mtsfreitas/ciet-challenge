import java.util.ArrayList;

class Questao6{

	static final double TEMPO_COMBINACAO = 2.0; // em segundos
	static final int[] POSSIVEIS_PRIMEIRO_DIGITO = {3, 6};
	static final int SOMA_DIGITOS = 8;
	static final int QTD_LETRAS_SENHA = 3;
	static final char[] LETRAS_PRESENTES = {'A', 'D'};
	static final char[] DEMAIS_LETRAS_VALIDAS = {'B', 'C', 'E', 'F'};

	public static void main(String[] args){		
		ArrayList<String> combinacoes = getCombinacoes();

		combinacoes.forEach((combinacao) -> {
			System.out.print(combinacao + " ");
		});

		System.out.println("\nTempo total: " + (combinacoes.size() * TEMPO_COMBINACAO) + " segundos");
	}

	static ArrayList<String> getCombinacoes(){
		int qtd_possiveis_primeiro_digito = POSSIVEIS_PRIMEIRO_DIGITO.length;

		ArrayList<String> combinacoes_numericas = new ArrayList<>();

		for(int i = 0; i < qtd_possiveis_primeiro_digito; i++){
			int d1 = POSSIVEIS_PRIMEIRO_DIGITO[i];
			int soma_restante_1 = SOMA_DIGITOS - d1;
			for(int j = 1; j < soma_restante_1; j++){ // segundo digito
				int k = soma_restante_1 - j; // terceiro digito				
				combinacoes_numericas.add("" + d1 + j + k);				
			}
		}

		ArrayList<String> combinacoes_letras = new ArrayList<>();

		int qtd_letras_presentes = LETRAS_PRESENTES.length;
		int qtd_demais_letras_validas = DEMAIS_LETRAS_VALIDAS.length;

		for(int i = 0; i < qtd_demais_letras_validas; i++){
			char[] combinacao_letras = new char[QTD_LETRAS_SENHA];
			combinacao_letras[0] = DEMAIS_LETRAS_VALIDAS[i];
			
			// Colocando as letras que certamente estao presentes na senha
			for(int k = 0; k < qtd_letras_presentes; k++){
				combinacao_letras[1 + k] = LETRAS_PRESENTES[k];
			}

			// permutando a combinação anterior e inserindo no vetor de combinacoes de letras
			ArrayList<String> permutacoes = new ArrayList<>();
			permutar(combinacao_letras, 0, combinacao_letras.length-1, permutacoes);
			combinacoes_letras.addAll(permutacoes);
		}

		ArrayList<String> combinacoes = new ArrayList<>();

		combinacoes_numericas.forEach((cn) -> {			
			combinacoes_letras.forEach((cl) -> {
				combinacoes.add(cn + cl);
			});
		});

		return combinacoes;
	}

	static void permutar(char[] vetor, int i, int f, ArrayList<String> permutacoes){
		if(i == f){
			permutacoes.add(new String(vetor));
		} else{
			for(int k = i; k <= f; k++){
				trocarElementos(vetor, i, k);
				permutar(vetor, i+1, f, permutacoes);
				trocarElementos(vetor, i, k);
			}
		}
	}

	static void trocarElementos(char[] vetor, int i, int j){
		char e = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = e;
	}

}