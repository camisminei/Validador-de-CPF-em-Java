
public abstract class Funcionario extends Pessoa implements Tributavel{
	
	Endereco endereco;
	
	
	public Funcionario(String nome, String cpf, String sexo, String celular, String email, Endereco endereco) {
		super(nome, cpf, sexo, celular, email);
		this.endereco = endereco;
	}

	public abstract double calcularSalario();

	
	
	
}
