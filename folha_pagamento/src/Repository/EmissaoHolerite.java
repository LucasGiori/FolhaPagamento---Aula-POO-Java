package Repository;

import java.util.List;
import java.util.Scanner;

import Entity.Funcionario;
import Entity.Holerite;

public class EmissaoHolerite {

	public EmissaoHolerite(){
		
	}
	public static List<Holerite> emitirHolerite(List<Funcionario> funcionarios, Scanner ler) {
		System.out.println("\nID início:");
		Long idInicio = ler.nextLong();
		
		System.out.println("\nID Fim:");
		Long idFim = ler.nextLong();
		
		
		System.out.println("\n1-Salário"
				+ "\n2-Férias"
				+ "\n3-Decimo Teceiro\n");
		int opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			funcionarios.forEach(func->{
				if(func.getId() >= idInicio && func.getId() <= idFim) {
					System.out.println();
				}
			});
			
			break;
		case 2 :
			
			break;
		case 3:
			
			break;
		
		default:
			System.out.println("\n Opção inválida!");
			break;
		}
		
		return null;
	}
}
