package atividade_2_selmas;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Methods methods = new Methods();
		Scanner teclado = new Scanner(System.in);
		
		int option;
		
		methods.arraymaker();
		for(int i = 0; i < 1; ) {
		
			System.out.println("Lista de Operações");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Consultar Produto");
            System.out.println("3 - Listar todos os Produto");
            System.out.println("4 - Excluir Produtos");
            System.out.println("5 - Final");
            System.out.print("Digite o número da operação: ");
            option = teclado.nextInt();
            System.out.println();
            
            	if(option == 1) {
                    methods.productmaker();
                }else if(option == 2) {
                    methods.search();
                }else if(option == 3){
                    methods.list();
                }else if(option == 4) {
                    methods.deleter();
                }else if(option == 5) {
                    System.out.println("Operação Encerrada!");
                    i++;
                }else {
                	System.out.println("Tente Novamente");
                }
	
		}
			
	}

}
