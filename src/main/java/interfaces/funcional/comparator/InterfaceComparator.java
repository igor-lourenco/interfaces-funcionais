package interfaces.funcional.comparator;

import java.util.ArrayList;
import java.util.List;

import interfaces.funcional.comparator.entities.MyComparator;
import interfaces.funcional.comparator.entities.Produto;
import java.util.Comparator;

public class InterfaceComparator {

	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00, 1));
		list.add(new Produto("Notebook", 1200.00, 2));
		list.add(new Produto("Tablet", 450.00, 3));
		list.add(new Produto("Galaxy", 750.00, 3));

		list.sort(new MyComparator());

		System.out.println("----- Usando classe que implementa Comparator -----");
		for (Produto p : list) {
			System.out.println(p);
		}

//		===============================================================
		
		
		Comparator<Produto> criteria1 = new Comparator<Produto>() {
			@Override
			public int compare(Produto p1, Produto p2) {
				return p1.getNome().toUpperCase().compareToIgnoreCase(p2.getNome());
			}
		};

		list.sort(criteria1);

		System.out.println("\n----- Usando classe anonima -----");
		for (Produto p : list) {
			System.out.println(p);
		}

//		===============================================================

		
		Comparator<Produto> criteria2 = (p1, p2) -> p1.getNome().toUpperCase().compareToIgnoreCase(p2.getNome());

		list.sort(criteria2);

		System.out.println("\n----- Usando função anonima declarada -----");
		for (Produto p : list) {
			System.out.println(p);
		}

//		===============================================================
		

		list.sort((p1, p2) -> p1.getValor().compareTo(p2.getValor()));

		System.out.println("\n----- Usando função anonima inline -----");
		for (Produto p : list) {
			System.out.println(p);
		}
		
		
//		===============================================================
		
		
		Comparator<Produto> criteria3 = Comparator.comparing(Produto::getQuantidade).reversed() // compara quantidade decrescente
				.thenComparing(Produto::getNome); // segunda comparacao caso tiver 2 quantidade iguais
		
		list.sort(criteria3);
		System.out.println("\n----- Usando reference method com método não estático -----");
		for (Produto p : list) {
			System.out.println(p);
		}
		
//		===============================================================

		
		System.out.println("\n----- Usando função que recebe função como argumento -----");
		
		Produto p1 = new Produto("TV", 900.00, 1);
		Produto p2 = new Produto("Notebook", 1200.00, 2);
		
		Produto p = MyComparator.myCompare(p1, p2, Comparator.comparing(Produto::getNome));
		
		System.out.println(p);
		
		
	}

}
