package interfaces.funcional.predicate;

import java.util.ArrayList;
import java.util.List;

import interfaces.funcional.predicate.entities.MyPredicate;
import interfaces.funcional.predicate.entities.Produto;


public class InterfacePredicate {

	public static void main(String[] args) {


		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		
		list.removeIf(new MyPredicate());
		
		System.out.println("--- Usando classe que implementação da interface ------");
		for (Produto p : list) {
			System.out.println(p);
		}
		
		
		
		
		

	}

}
