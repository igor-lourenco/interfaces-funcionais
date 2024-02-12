package interfaces.funcional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import interfaces.funcional.function.entities.MyFunction;
import interfaces.funcional.function.entities.Produto;


public class InterfaceFunction {

	public static void main(String[] args) {

		
		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 20.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("Galaxy", 75.00));
		
		List<String> nomes1 = list.stream().map(new MyFunction()).collect(Collectors.toList());
		
		System.out.println("--- Usando classe que implementação da interface ------");
		nomes1.forEach(System.out::println);
		
//		===============================================================
		
		List<String> nomes2 = list.stream().map(Produto::staticUppercaseNome).collect(Collectors.toList());
		
		System.out.println("--- Usando Reference Method com metodo static 1 ------");
		nomes2.forEach(System.out::println);

		List<Double> nomes3 = list.stream().map(Produto::staticPreco).collect(Collectors.toList());
		
		System.out.println("--- Usando Reference Method com metodo static 2 ------");
		nomes3.forEach(System.out::println);
		
		
		
		
		
		
	}

}
