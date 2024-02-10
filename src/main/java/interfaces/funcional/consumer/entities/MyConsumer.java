package interfaces.funcional.consumer.entities;

import java.util.function.Consumer;

import interfaces.funcional.predicate.entities.Produto;

public class MyConsumer implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		p.setValor(p.getValor() * 1.1 );
	}

}
