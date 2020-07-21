
public class Endereco {
	
	String rua, numero, complemento, bairro, cidade,CEP;
	
	public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String CEP){
		this.rua=rua;
		this.numero=numero;
		this.complemento=complemento;
		this.bairro=bairro;
		this.cidade=cidade;
		this.CEP = CEP;
	}
	
	public Endereco(String rua, String numero,String bairro, String cidade, String CEP){
		this.rua=rua;
		this.numero=numero;
		this.bairro=bairro;
		this.cidade=cidade;
		this.CEP = CEP;
		this.complemento = "";
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	@Override
	public String toString() {
		
		if(getComplemento() == "") {
			return "\nrua= " + rua + "\nnumero= " + numero + "\nbairro= " + bairro
					+ "\ncidade= " + cidade + "\nCEP= " + CEP;
		}
		else {
			return "\nrua= " + rua + "\nnumero= " + numero + "\ncomplemento= " + complemento + "\nbairro= " + bairro
					+ "\ncidade= " + cidade + "\nCEP= " + CEP;
		}
	}
	
}
