
public class TesteCadastroAluno {
	public static void main(String[] args) {
		
		CadastroAluno cadastro = new CadastroAluno();
		
		cadastro.nome = new Nome();
		cadastro.nome.primeiroNome = "Joao";
		cadastro.nome.sobrenome = "Gomes";
		
		cadastro.endereco = new Endereco();
		cadastro.endereco.rua = "Sem nome";
		cadastro.endereco.numero = 0;
		
		cadastro.display();
		
		CadastroAluno cadastro2 = new CadastroAluno();
		
		cadastro2.nome = new Nome();
		cadastro2.nome.primeiroNome = "Maria";
		cadastro2.nome.sobrenome = "Batista";
		
		cadastro2.endereco = new Endereco();
		cadastro2.endereco.rua = "Com nome";
		cadastro2.endereco.numero = 1;
		
		cadastro2.display();
		
	}
}
