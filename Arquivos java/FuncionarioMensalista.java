public class FuncionarioMensalista extends Funcionario {
	
	private double salarioMensal;
	
	public FuncionarioMensalista(String nome, String cpf, String sexo, String celular, String email,
			Endereco endereco, double salarioMensal) throws Exception {
		
		super(nome, cpf, sexo, celular, email, endereco);
		
			try {
				if(salarioMensal > 0) {
					this.salarioMensal=salarioMensal;
				}
				else {
					throw new Exception();
				}
			}
			catch(Exception e) {
				System.err.println("PARA FUNCIONARIO MENSALISTA VALOR DE SALÁRIOS NEGATIVOS LANÇADOS SERÃO AUTOMATICAMENTES ZERADOS");
			}
		
	}
	
	public double getSalarioMensal() {
		
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double calcularImposto() {
		
		double inss = 0;
		double ir = 0;
		
		if(getSalarioMensal()> 0 && getSalarioMensal()<=1830.29) {
			inss= getSalarioMensal() * 0.08;
		}
		else if(getSalarioMensal()>1830.29 && getSalarioMensal()<=3050.52) {
			inss=getSalarioMensal()*0.09;
		}
		else if(getSalarioMensal() > 3050.52 && getSalarioMensal()<=6101.06) {
			inss=getSalarioMensal()*0.11;
		}
		
		if(getSalarioMensal() >= 1903.99 && getSalarioMensal() <= 2826.65) {
			ir= getSalarioMensal() * 0.075;
		}
		
		if(getSalarioMensal() > 2826.65 && getSalarioMensal() <= 3751.05 ) {
			ir= getSalarioMensal() * 0.15;
		}
		
		if(getSalarioMensal() > 3751.05 && getSalarioMensal() <= 4664.6) {
			ir= getSalarioMensal() * 0.225;
		}
		
		if(getSalarioMensal() > 4664.6) {
			ir= getSalarioMensal() * 0.275;
		}
		
		return inss + ir;
	}
	
	public double calcularSalario(){
		return getSalarioMensal()-calcularImposto();
	}

	@Override
	public String toString() {
		return "FuncionarioMensalista [\nnome: " + getNome() + "\nsalario R$ " + String.format("%.2f", calcularSalario()) + endereco + "]\n";
	}

}
