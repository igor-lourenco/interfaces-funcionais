package interfaces.funcional.consumer.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {

	private String nome;
	private Double valor;

	public static void staticPrecoUpdate(Produto p) {
		p.setValor(p.getValor() * 1.1);
	}
	
	public static void staticNomeUpdate(Produto p) {
		p.setNome(p.getNome().toUpperCase());
	}
	
	public void nonStaticPrecoUpdate() {
		valor = valor * 1.1;
	}

	public void nonStaticNomeUpdate() {
		nome = nome.toLowerCase();
	}
}
