package interfaces.funcional.consumer;

import java.util.ArrayList;
import java.util.List;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
