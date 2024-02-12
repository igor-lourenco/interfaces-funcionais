package interfaces.funcional.function.entities;

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
	
	public static String staticUppercaseNome(Produto p) {
		return p.getNome().toUpperCase();
	}

	public static Double staticPreco(Produto p) {
		Double x  = p.getValor() * 1.1;
		return x;
	}

	public String nonStaticUppercaseNome() {
		return nome.toUpperCase();
	}
	
	public Double nonStaticPreco() {
		return valor * 1.1;
	}
	
	
}
