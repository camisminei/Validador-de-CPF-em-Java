
public class FuncionarioComissado extends Funcionario {
	
	private double vendasBrutas, taxaDeComissao;

	public FuncionarioComissado(String nome, String cpf, String sexo, String celular, String email, Endereco endereco,
			double vendasBrutas, double taxaDeComissao) {
		super(nome, cpf, sexo, celular, email, endereco);
		
		try {
			if(vendasBrutas > 0 && taxaDeComissao > 0) {
				this.vendasBrutas = vendasBrutas;
				this.taxaDeComissao=taxaDeComissao;
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception e) {
			System.err.println("PARA FUNCIONARIO COMISSADO VALOR DE VENDAS BRUTAS E/OU TAXA DE COMISSÃO NEGATIVOS LANÇADOS SERÃO AUTOMATICAMENTES ZERADOS");
		}
		
	}
	
	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}

	public void setTaxaDeComissao(double taxaDeComissao) {
		this.taxaDeComissao = taxaDeComissao;
	}


	@Override
	public double calcularImposto() {
		double inss = 0;
		double ir = 0;
		double total = getTaxaDeComissao() * getVendasBrutas();
		
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
		return (getTaxaDeComissao()*getVendasBrutas()) - calcularImposto();
	}

	@Override
	public String toString() {
		return "FuncionarioComissado [\nnome: " + getNome() + "\nsalario R$ " + String.format("%.2f", calcularSalario())+ endereco + "]\n";
	}
	
	
	

}
