package interfaces.funcional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import interfaces.funcional.consumer.entities.MyConsumer;
import interfaces.funcional.consumer.entities.Produto;

public class InterfaceConsumer {
	
	public static void main(String[] args) {
		
		
		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		
		list.forEach(new MyConsumer());
		
		System.out.println("--- Usando classe que implementação da interface ------");
		for (Produto p : list) {
			System.out.println(p);
		}
	
//		===============================================================
		
		list.forEach(Produto::staticPrecoUpdate);
		
		System.out.println("\n--- Usando Reference Method com metodo static 1 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
	
		list.forEach(Produto::staticNomeUpdate);
		
		System.out.println("\n--- Usando Reference Method com metodo static 2 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
	
//		===============================================================
		
		list.forEach(Produto::nonStaticPrecoUpdate);
		
		System.out.println("\n--- Usando Reference Method com metodo não static 1 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
	
		list.forEach(Produto::nonStaticNomeUpdate);
		
		System.out.println("\n--- Usando Reference Method com metodo não static 2 ------");
		for (Produto p : list) {
			System.out.println(p);
		}
	
	
//		===============================================================
		
		Double fator = 1.1;
		Consumer<Produto> criteria1 = p -> p.setValor(p.getValor() * fator);
		
		list.forEach(criteria1);
	
		System.out.println("\n--- Usando expressão lambda declarada 1 ------");
		list.forEach(System.out::println);

		Consumer<Produto> criteria2 = p -> p.setNome(p.getNome().toUpperCase());
		
		list.forEach(criteria2);
		
		System.out.println("\n--- Usando expressão lambda declarada 2 ------");
		list.forEach(System.out::println);
	
//		===============================================================
		
		list.forEach( p -> p.setValor(p.getValor() * fator));
	
		System.out.println("\n--- Usando expressão lambda inline (direto o metodo) 1 ------");
		list.forEach(System.out::println);

		
		list.forEach(p -> p.setNome(p.getNome().toLowerCase()));
		
		System.out.println("\n--- Usando expressão lambda inline (direto o metodo) 2 ------");
		list.forEach(System.out::println);
	
//		===============================================================
	
		Double taxa = 0.2;
		Consumer<Produto> criteria3 = p -> p.setValor(p.getValor() * fator);
		list.forEach(p -> MyConsumer.taxaPreco(p, criteria3, taxa));
	
		System.out.println("\n--- Criando função que recebe função como argumento 1 ---");
		list.forEach(System.out::println);
	
		String caracter = " ";
		Consumer<Produto> criteria4 = p -> p.setNome(p.getNome().toUpperCase());
		list.forEach(p -> MyConsumer.alteraNome(p, criteria4, caracter));
	
		System.out.println("\n--- Criando função que recebe função como argumento 2 ---");
		list.forEach(System.out::println);
	
		Produto novo = new Produto("Geladeira", 2000.0);
	
		System.out.println("\n--- Criando função que recebe função como argumento com objeto ---");
		
		MyConsumer.taxaPreco(novo, criteria3, taxa);
		System.out.println(novo);

		MyConsumer.alteraNome(novo, criteria4, "*");
		System.out.println(novo);
		
		
	}
	

}
