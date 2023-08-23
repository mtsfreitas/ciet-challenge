class Questao5{

	public static void main(String[] args){
		final int QTD_YOSHIS_PESQUISA		= 1000;
		final int QTD_YOSHI_ISLAND		= 450;
		final int QTD_CHOCOLATE_ISLAND 		= 330;
		final int QTD_COOKIE_MOUNTAIN		= 340;
		final int QTD_YOSHI_CHOCOLATE		= 200;
		final int QTD_YOSHI_COOKIE		= 180;
		final int QTD_CHOCOLATE_COOKIE		= 100;
		final int QTD_YOSHI_CHOCOLATE_COOKIE	= 30;

		// Calculando a quantidade de yoshis que gostam de viver apenas em Yoshi Island
		final int QTD_APENAS_YOSHI_ISLAND = QTD_YOSHI_ISLAND - (QTD_YOSHI_CHOCOLATE + QTD_YOSHI_COOKIE + QTD_YOSHI_CHOCOLATE_COOKIE);

		// Calculando a quantidade de yoshis que gostam de viver apenas em Chocolate Island
		final int QTD_APENAS_CHOCOLATE_ISLAND = QTD_CHOCOLATE_ISLAND - (QTD_YOSHI_CHOCOLATE + QTD_CHOCOLATE_COOKIE + QTD_YOSHI_CHOCOLATE_COOKIE);

		// Calculando a quantidade de yoshis que gostam de viver apenas em Chocolate Island
		final int QTD_APENAS_COOKIE_MOUNTAIN = QTD_COOKIE_MOUNTAIN - (QTD_YOSHI_COOKIE + QTD_CHOCOLATE_COOKIE + QTD_YOSHI_CHOCOLATE_COOKIE);

		// Calculando a quantidade de yoshis que gostam de viver em apenas uma localidade
		final int QTD_APENAS_UMA_LOCALIDADE = QTD_APENAS_YOSHI_ISLAND + QTD_APENAS_CHOCOLATE_ISLAND + QTD_APENAS_COOKIE_MOUNTAIN;

		// System.out.println(QTD_APENAS_YOSHI_ISLAND); // 40
		// System.out.println(QTD_APENAS_CHOCOLATE_ISLAND); // 0
		// System.out.println(QTD_APENAS_COOKIE_MOUNTAIN); // 30
		// System.out.println(QTD_APENAS_UMA_LOCALIDADE); // 70
		
		// Calculando o nº de yoshis que não gostam de viver em nenhuma dessas localidades
		final int QTD_NENHUMA_LOCALIDADE = QTD_YOSHIS_PESQUISA - (QTD_APENAS_UMA_LOCALIDADE + QTD_YOSHI_CHOCOLATE + QTD_YOSHI_COOKIE + QTD_CHOCOLATE_COOKIE + QTD_YOSHI_CHOCOLATE_COOKIE);

		System.out.println("Quantidade de Yoshis que nao gostam de nenhuma destas localidades: " + QTD_NENHUMA_LOCALIDADE);
		System.out.println("Quantidade de Yoshis que gostam de apenas uma localidade: " + QTD_APENAS_UMA_LOCALIDADE);
	}

}