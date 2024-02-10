package interfaces.funcional.consumer.entities;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Produto> {

	@Override
	public void accept(Produto p) {
		p.setValor(p.getValor() * 1.1);
	}

	public static void taxaPreco(Produto p, Consumer<Produto> criteria, Double taxa) {

		criteria.accept(p);

		if (p.getValor() > 1000.0) {
			p.setValor(p.getValor() - p.getValor() * taxa);
		}
		
	}
	
	public static void alteraNome(Produto p, Consumer<Produto> criteria, String caracter) {

		criteria.accept(p);
		p.setNome(p.getNome().replaceAll("(?i)[aeiou]", caracter));
	}

}
