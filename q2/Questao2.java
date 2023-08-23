import java.util.ArrayList;
import java.util.Arrays;

class Questao2{

	public static void main(String[] args){
		final int N = 120;
		Questao2 q2 = new Questao2();
		ArrayList<Integer> primos_ate_N = q2.getPrimos(N);
		
		System.out.println(Arrays.toString(primos_ate_N.toArray()));
	}

	ArrayList<Integer> getPrimos(final int N){
		ArrayList<Integer> primos = new ArrayList<>();
		if(N < 2)
			return primos; // se N for menor do que 2, um array vazio é retornado.
		primos.add(2);
		for(int i = 3; i <= N; i += 2){
			double raiz = Math.sqrt(i);
			int j;
			for(j = 3; j <= raiz; j += 2){
				if(i % j == 0)
					break;
			}
			if(j > raiz) // se o loop acima não se quebrou, então i é primo
				primos.add(i);
		}

		return primos;		
	}	

}