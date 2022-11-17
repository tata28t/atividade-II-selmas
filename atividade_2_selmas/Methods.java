package atividade_2_selmas;

import java.util.Scanner;
import java.util.Formatter.*;
import java.util.Iterator;

public class Methods {
Product []product = new Product[10];
	
public void arraymaker() {

for (int i = 0; i < product.length ; i++) {
	
	product[i] = new Product();
	
	
}
	
	
	
}	

public void productmaker() {
Scanner teclado = new Scanner(System.in);

for (int i = 0; i < product.length; i++) {
if(product[i].name.equals("")){
	
	System.out.println("Escreva o nome do produto:");
	product[i].name = teclado.nextLine();
	
	System.out.println("Escreva o valor do produto:");
	product[i].value = teclado.nextDouble();
	
	System.out.println("Escreva a quantidade disponivel do produto:");
	product[i].quanty = teclado.nextInt();
	
	
	System.out.println("Produto foi cadastrado.");
	
	return;
}
}
System.out.println("Existem " + product.length + " já cadastrados");
	
	
	
	
	
}

public void search() {
	
	Scanner teclado = new Scanner(System.in);
	String Search;
	
	System.out.println("Digete o nome do produto");
	Search = teclado.nextLine();
	
	for (int i = 0; i < product.length; i++) {
	
		if(Search.equals(product[i].name)) {
			System.out.println("Código do produto: " + i );
			
			System.out.println("Nome do produto: " + product[i].name );
			
			System.out.println("Valor do produto: " + String.format("%.2f", product[i].value) );
			
			System.out.println("Quantidade do produto: " + product[i].quanty + "\n");
			
			
			return;
		}
		
		
		
	}
	
	System.out.println("Produto não encontrado \n" );
	
	
	
	
	
	
}
	
public void list() {
	
	
	int check = 0;
	
	System.out.println("Listando");
	
	for (int i = 0; i < product.length; i++) {
		
		if(!product[i].name.equals("")) {
			System.out.println("Código do produto: " + i );
			
			System.out.println("Nome do produto: " + product[i].name );
			
			System.out.println("Valor do produto: " + String.format("%.2f", product[i].value) );
			
			System.out.println("Quantidade do produto: " + product[i].quanty + "\n");
			
	
		
		}else { check++;}
		
		
	}
	if(check == product.length) {
		System.out.println("Não existem produtos cadastrados.");
	}
	
	
	
	
}	

public void deleter() {
	
	Scanner teclado = new Scanner(System.in);
	String Search;
	
	System.out.println("Digete o nome do produto");
	Search = teclado.nextLine();
	
	for (int i = 0; i < product.length; i++) {
	
		if(Search.equals(product[i].name)) {
			System.out.println("Deletando o produto");
			
			System.out.println("Código do produto: " + i );
			
			System.out.println("Nome do produto: " + product[i].name );
			
			product[i].name = "";
			product[i].value = 0;
			product[i].quanty = 0;
			
			return;
		}
		
		
		
	}
	
	System.out.println("Produto não encontrado \n" );
	
	
	
	
	
	
}
}
