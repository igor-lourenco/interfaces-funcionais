package interfaces.funcional.function.entities;

import java.util.function.Function;

public class MyFunction implements Function<Produto, String> {

	@Override
	public String apply(Produto p) {
		return p.getNome().toUpperCase();
	}

	
	public static String retornaNomeModificado(Produto p, Function<Produto, String> criteria) {
		
		String x = criteria.apply(p);
		char[] y = x.toCharArray();
		
		String z = "";
		
		for(int i = 0; i < y.length; i++) {
			if(i % 2 != 0) {
				char aux = y[i];
				z = z.concat(String.valueOf(aux).toLowerCase());
			}else {
				z = z.concat(String.valueOf(y[i]));
			}
		}
		
		return z;
	}
	
	public static Double retornaTaxaPreco(Produto p, Function<Produto, Double> criteria) {
		
		Double x = criteria.apply(p);

		if(x > 500.0) {
			x = x + x * 0.2; 
		}
		
		return x;
	}
}
