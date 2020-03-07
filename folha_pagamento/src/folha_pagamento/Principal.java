package folha_pagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Funcionario;
import Repository.CadastroFuncionario;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Software Folha Pagamento!");
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		int contId = 0;
 		
		
		do {
			System.out.println("\n1 - Cadastrar Funcionário\n"
					+ "2 - Calcular Folha \n"
					+ "3 - Sair\n Informe a opção Desejada:\n");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				contId++;
				funcionarios.add(CadastroFuncionario.cadastrar(contId, ler));
				
				System.out.println("\n Funcionário Cadastrado com Sucesso");
//				System.out.println(funcionarios.get(0));
				break;

			case 2:
				break;
			
				
			case 3:
				break;
			
			default:
				System.out.println("Opção Inválida");
			}
			
		} while (opcao !=  3);
		ler.close();
	}
	
}
