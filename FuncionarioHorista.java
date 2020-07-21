
public class FuncionarioHorista extends Funcionario{
	
	private double salarioHora;
	private double horas;

	public FuncionarioHorista(String nome, String cpf, String sexo, String celular, String email, Endereco endereco,
			double salarioHora, double horas) {
		super(nome, cpf, sexo, celular, email, endereco);
		
		try {
			if(salarioHora > 0 && horas > 0) {
				this.salarioHora = salarioHora;
				this.horas = horas;
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception e) {
			System.err.println("PARA FUNCIONARIO HORISTA VALOR DE SALÁRIOS E/OU HORAS NEGATIVOS(AS) LANÇADOS SERÃO AUTOMATICAMENTES ZERADOS");
		}
		
		
	} 

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public double calcularImposto() {
		double inss = 0;
		double ir = 0;
		double total = getSalarioHora() * getHoras();
		
		if(total > 0 && total <=1830.29) {
			inss= total * 0.08;
		}
		else if(total > 1830.29 && total <=3050.52) {
			inss=total*0.09;
		}
		else if(total > 3050.52 && total <=6101.06) {
			inss=total*0.11;
		}
		
		if(total >= 1903.99 && total <= 2826.65) {
			ir= total * 0.075;
		}
		
		if(total > 2826.65 && total<= 3751.05 ) {
			ir= total * 0.15;
		}
		
		if(total > 3751.05 && total<= 4664.6) {
			ir= total* 0.225;
		}
		
		if(total > 4664.6) {
			ir= total* 0.275;
		}
		
		return inss + ir;
	}

	@Override
	public double calcularSalario() {
		
		return (getSalarioHora()*getHoras()) - calcularImposto();
	}

	@Override
	public String toString() {
		return "FuncionarioHorista [\nnome: "+ getNome() +"\nsalario R$ "+ String.format("%.2f", calcularSalario()) + endereco + "]\n";
	}
	
}
