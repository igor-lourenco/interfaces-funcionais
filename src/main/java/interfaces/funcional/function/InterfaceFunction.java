package interfaces.funcional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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
		
//		===============================================================
		
		List<String> nomes4 = list.stream().map(Produto::nonStaticUppercaseNome).collect(Collectors.toList());

		System.out.println("\n--- Usando Reference Method com metodo não static 1 ------");
		nomes4.forEach(System.out::println);
		
		
		List<Double> nomes5 = list.stream().map(Produto::nonStaticPreco).collect(Collectors.toList());

		System.out.println("\n--- Usando Reference Method com metodo não static 1 ------");
		nomes5.forEach(System.out::println);
		
//		===============================================================

		Function<Produto, String> criteria1 = p -> p.getNome().toUpperCase();
		
		List<String> nomes6 = list.stream().map(criteria1).collect(Collectors.toList());
	
		System.out.println("\n--- Usando expressão lambda declarada 1 ------");
		nomes6.forEach(System.out::println);

		Function<Produto, Double> criteria2 = p -> p.getValor() * 1.1;
		
		List<Double> nomes7 = list.stream().map(criteria2).collect(Collectors.toList());
		
		System.out.println("\n--- Usando expressão lambda declarada 2 ------");
		nomes7.forEach(System.out::println);

		
//		===============================================================
		
		
		List<String> nomes8 = list.stream().map( p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		System.out.println("\n--- Usando expressão lambda inline (direto o metodo) 1 ------");
		nomes8.forEach(System.out::println);
		
		
		List<Double> nomes9 = list.stream().map(p -> p.getValor() * 1.1).collect(Collectors.toList());
		
		System.out.println("\n--- Usando expressão lambda inline (direto o metodo) 2 ------");
		nomes9.forEach(System.out::println);
	
//		===============================================================
	
		
		Function<Produto, String> criteria3 = p -> p.getNome().toUpperCase();
		List<String> nomes10 = list.stream().map( p -> MyFunction.retornaNomeModificado(p, criteria3)).collect(Collectors.toList());
	
		System.out.println("\n--- Criando função que recebe função como argumento 1 ---");
		nomes10.forEach(System.out::println);

		Function<Produto, Double> criteria4 = p -> p.getValor() * 1.1;
		List<Double> nomes11 = list.stream().map( p -> MyFunction.retornaTaxaPreco(p, criteria4)).collect(Collectors.toList());
		
		System.out.println("\n--- Criando função que recebe função como argumento 2 ---");
		nomes11.forEach(System.out::println);
	
	
	
	
	
	}

}
