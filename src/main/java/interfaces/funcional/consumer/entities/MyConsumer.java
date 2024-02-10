package interfaces.funcional.consumer.entities;

import java.util.function.Consumer;


public class MyConsumer implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		p.setValor(p.getValor() * 1.1 );
	}

}
