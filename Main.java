
public class Main {

	public static void main(String[] args) throws Exception {
		
		//MELHOR CASO DE TESTE, PASSAM POR TODAS AS VALIDAÇÕES
		System.out.println("*****MELHOR CASO DE TESTE, PASSAM POR TODAS AS VALIDAÇÕES*****\n");
		Endereco e1 = new Endereco("Rua Alagoas", "1354", "Centro", "Campo Grande", "7900260");
		FuncionarioComissado f1 = new FuncionarioComissado("Carlos Bitterncourt", "52998224725", "M", "996133911", "@gmail.com", e1, 4000, 2.5);
		System.out.println(f1.toString());
		
		
		Endereco e2 = new Endereco("Rua Alagoas", "1354", "Centro", "Campo Grande", "7900260");
		FuncionarioMensalista f2 = new FuncionarioMensalista("André Souza", "52998224725", "M", "33418733", "@gmail.com", e2, 3000.50);
		System.out.println(f2.toString());
		
		
		Endereco e3 = new Endereco("Rua arco iris", "6060", "apt 102", "Dazamiga", "Dourados", "789654236");
		FuncionarioHorista f3 = new FuncionarioHorista("Karen Bachinni", "52998224725", "F", "798453677", "@gmail.com", e3, 80.5, 160);
		System.out.printf(f3.toString());
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//CASO DE TESTE COM EXCEÇÕES
		/*System.out.println("\n*****CASO DE TESTE COM EXCEÇÕES*****");
		Endereco e5 = new Endereco("Rua Alagoas", "1354", "Centro", "Campo Grande", "7900260");
		FuncionarioComissado f5 = new FuncionarioComissado("Carlos Bitterncourt", "52998224725", "M", "996133911", "@gmail.com", e5, -4000, -2.5);
		System.out.println(f5.toString());
				
		Endereco e6 = new Endereco("Rua Alagoas", "1354", "Centro", "Campo Grande", "7900260");
		FuncionarioMensalista f6 = new FuncionarioMensalista("André Souza", "52998224725", "M", "33418733", "@gmail.com", e6, -3000.50);
		System.out.println(f6.toString());
				
		Endereco e7 = new Endereco("Rua arco iris", "6060", "apt 102", "Dazamiga", "Dourados", "789654236");
		FuncionarioHorista f7 = new FuncionarioHorista("Karen Bachinni", "52998224725", "F", "798453677", "@gmail.com", e7, -80.5, -160);
		System.out.printf(f7.toString());*/
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		//CASO DE TESTE COM ERRO NA VALIDAÇÃO DO CPF
		/*System.out.println("\n*****CASO DE TESTE COM ERRO NA VALIDAÇÃO DO CPF*****");
		Endereco e4 = new Endereco("Rua Alagoas", "1354", "Zona Oeste", "São Paulo", "7900260");
		FuncionarioComissado f4 = new FuncionarioComissado("Gabib Fadel", "52998224726", "F", "996133911", "@gmail.com", e4, 4000, 2.5);
		System.out.println(f4.toString());*/

	}

}
