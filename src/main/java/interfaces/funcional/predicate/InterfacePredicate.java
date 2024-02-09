package interfaces.funcional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
		
//		===============================================================
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		list.removeIf(Produto::staticProdutoPrecoPredicate);
		
		System.out.println("\n--- Usando Reference Method com metodo static 1 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
		
//		===============================================================
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		list.removeIf(Produto::staticProdutoProdutoPredicate);
		
		System.out.println("\n--- Usando Reference Method com metodo static 2 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
		
//		===============================================================
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		list.removeIf(Produto::nonStaticProdutoPrecoPredicate);
		
		System.out.println("\n--- Usando Reference Method com metodo não static 1 ------");
		for (Produto p : list) {
			System.out.println(p);
		}

		
//		===============================================================
				
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));

		list.removeIf(Produto::nonStaticProdutoProdutoPredicate);

		System.out.println("\n--- Usando Reference Method com metodo não static 2 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
		
//		===============================================================
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		double min = 100.0;
		Predicate<Produto> criteria1 = p -> p.getValor() >= min;

		list.removeIf(criteria1);

		System.out.println("\n--- Usando expressao lambda declarada 1 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		String c = "N";
		Predicate<Produto> criteria2 = p -> p.getNome().toUpperCase().contains(c);
		
		list.removeIf(criteria2);
		
		System.out.println("\n--- Usando expressao lambda declarada 2 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
		
//		===============================================================
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		list.removeIf(p -> p.getValor() >= 100);
	
		System.out.println("\n--- Usando expressao lambda inline 1 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
	
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
	
		list.removeIf(p -> p.getNome().toUpperCase().contains("G"));
		
		System.out.println("\n--- Usando expressao lambda inline 2 ------");
		list.forEach(System.out::println);
		
//		===============================================================
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Mouse", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		list.add(new Produto("Celular", 900.00));
		list.add(new Produto("Iphone", 20.50));
		list.add(new Produto("Cadeira", 450.00));
		list.add(new Produto("Mesa", 75.00));
		
		Double soma = MyPredicate.somaFiltrada(list, p -> p.getNome().charAt(0) == 'T' || p.getNome().charAt(0) == 'I');
	
		System.out.println("\nSoma: " + soma);
	}

}
