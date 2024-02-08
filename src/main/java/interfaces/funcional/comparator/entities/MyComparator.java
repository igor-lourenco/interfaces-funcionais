package interfaces.funcional.comparator.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getNome().toUpperCase().compareToIgnoreCase(p2.getNome());
	}

	public static Produto myCompare(Produto a, Produto b, Comparator<Produto> c) {
		
		//Implementa a regra de negocio 
		if(c.compare(a, b) > 0) {
			return a;
		}else if(c.compare(a, b) == 0) {
			return a;
		}else {
			return b;
		}
		
	}
}
