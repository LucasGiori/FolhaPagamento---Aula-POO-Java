package Repository;

import java.util.Scanner;

import Entity.Funcionario;

public class CadastroFuncionario {

	
	public CadastroFuncionario() {
		
	}
	
	public static Funcionario cadastrar(int contId, Scanner ler) {
		
		
		Funcionario funcionario = new Funcionario(new Long(contId));
		
		System.out.println("\n Informe o Nome: ");
		funcionario.setNome(ler.next());
		
		System.out.println("\n Informe o Salário: ");
		funcionario.setSalario(ler.nextDouble());
		
		return funcionario;
		
	}
}
