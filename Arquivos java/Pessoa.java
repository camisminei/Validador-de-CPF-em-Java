import java.util.Scanner;

public abstract class Pessoa implements Verificavel{
	
	private String nome, cpf, sexo, celular,email;
	
	public Pessoa(String nome, String cpf, String sexo, String celular, String email) {
		this.nome=nome;
		this.sexo=sexo;
		this.celular=celular;
		this.email=email;
		
		if(cpf.length() == 11) {
			validarCPF(cpf);
		}
		else {
			solicitarNovoCPF();
		}
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean validarCPF(String cpf) {
		
		int invalido = 0;
		
		for(int i=0; i<cpf.length(); i++) {
			
			 if(cpf.charAt(i) == '0' || cpf.charAt(i) == '1'|| cpf.charAt(i) == '2' || cpf.charAt(i) == '3' || cpf.charAt(i) == '4' || cpf.charAt(i) == '5' || 
					 cpf.charAt(i) == '6'|| cpf.charAt(i) == '7' || cpf.charAt(i) == '8' || cpf.charAt(i) == '9') {
				 invalido = 0;
			 }
			 else {
				 invalido ++;
				 break;
			 }
		 }
		
		if(invalido != 0) {
			solicitarNovoCPF();
			
		}else {
			if(cpf.length() == 11) {
				int soma = 0;
				int novaSoma =0 ;
				int cont1 =10;
				int cont2 = 11;
				
				for(int i=0; i<cpf.length()-2; i++) {
					soma += Integer.parseInt(String.valueOf(cpf.charAt(i)))*cont1;
					cont1--;	
				}
				int result = (soma*10)%11;
				
				if(result == Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
					for(int i=0; i<cpf.length()-1; i++) {
						novaSoma += Integer.parseInt(String.valueOf(cpf.charAt(i)))*cont2;
						cont2--;
					}
					
					int novoResult = (novaSoma*10)%11;
					
					if(novoResult == Integer.parseInt(String.valueOf(cpf.charAt(10)))){
						this.cpf=cpf;
						return true;
					}
					else {
						solicitarNovoCPF();
					}
				}
				else {
					solicitarNovoCPF();
				}
			}
			else {
				solicitarNovoCPF();
			}
		}
		 
		return false;
	}
	
	public void solicitarNovoCPF() {
		
		Scanner scan = new Scanner (System.in);
		System.err.println("O CPF INFORMADO É INVÁLIDO, EVITE UTILIZAR CARACTERES QUE SEJAM DIFERENTES DE NUMEROS, POR FAVOR INSIRA NOVAMENTE O CPF: ");
		String novoCPF = scan.nextLine();
		validarCPF(novoCPF);
	}

}


