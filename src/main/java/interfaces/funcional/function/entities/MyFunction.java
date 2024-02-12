package interfaces.funcional.function.entities;

import java.util.function.Function;

public class MyFunction implements Function<Produto, String> {

	@Override
	public String apply(Produto p) {
		return p.getNome().toUpperCase();
	}

}
