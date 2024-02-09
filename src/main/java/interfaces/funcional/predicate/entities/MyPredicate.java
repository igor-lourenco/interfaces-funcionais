package interfaces.funcional.predicate.entities;

import java.util.List;
import java.util.function.Predicate;

public class MyPredicate implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		return p.getValor() >= 100.0;
	}
	
	
	public static Double somaFiltrada(List<Produto> list, Predicate<Produto> criteria) {
		double soma = 0.0;

		for (Produto p : list) {
			if (criteria.test(p)) {
				soma += p.getValor();
			}
		}
		return soma;
	}

}
