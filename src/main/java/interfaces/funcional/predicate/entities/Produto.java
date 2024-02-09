package interfaces.funcional.predicate.entities;

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
	
	public static boolean staticProdutoPrecoPredicate(Produto p) {
		return p.getValor() >= 100.0;
	}
	
	
	public static boolean staticProdutoProdutoPredicate(Produto p) {
		return p.getNome().toUpperCase().contains("N");
	}
}
