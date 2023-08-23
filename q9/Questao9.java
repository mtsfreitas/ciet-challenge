import java.math.BigDecimal;

class Questao9{

	static final int QTD_SETORES_MIDGAR = 8;
	static final double AREA_MIDGAR = 2827.43;
	static final double AREA_CENTRAL = 314.15;

	public static void main(String[] args){
		double area_setor_7 = getAreaSetor7Midgar(AREA_MIDGAR, AREA_CENTRAL, QTD_SETORES_MIDGAR);

		// Arredondando para duas casas decimais
		area_setor_7 = arredondar(area_setor_7);

		System.out.println(area_setor_7);
	}

	static double getAreaSetor7Midgar(double area_midgar, double area_central, int qtd_setores_midgar){
		//double raio_midgar = Math.sqrt(area_midgar/Math.PI);
		//double raio_central = Math.sqrt(area_central/Math.PI);
		//double angulo_destruicao = 360/QTD_SETORES_MIDGAR;

		/* 
			A area do setor 7, pela figura, corresponde a area vermelha subtraida
			de parte da area central afetada pela destruicao
		*/
		return area_midgar/qtd_setores_midgar - area_central/qtd_setores_midgar;
	}

	static double arredondar(double v){
		return new BigDecimal(v).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}