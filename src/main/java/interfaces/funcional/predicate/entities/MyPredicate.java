package interfaces.funcional.predicate.entities;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		return p.getValor() >= 100.0;
	}

}
