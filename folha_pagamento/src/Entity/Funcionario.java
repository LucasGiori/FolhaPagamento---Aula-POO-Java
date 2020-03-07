package Entity;

public class Funcionario extends Pessoa {
	private Long id;
	private Double salario;

	public Funcionario() {
		
	}
	
	public Funcionario(Long id) {
		// TODO Auto-generated constructor stub
		setId(id);
			
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
