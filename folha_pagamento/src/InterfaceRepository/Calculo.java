package InterfaceRepository;

import Entity.Funcionario;
import Entity.Holerite;

public interface Calculo {
	public abstract Holerite calcular(Funcionario func);
}
