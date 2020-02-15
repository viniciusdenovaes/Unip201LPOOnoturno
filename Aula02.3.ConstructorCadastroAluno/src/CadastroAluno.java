
public class CadastroAluno {
	
	Nome nome;
	Endereco endereco;
	
	CadastroAluno(
			String primeiroNome, 
			String sobrenome, 
			String nomeDaRua, 
			int numeroDaRua) {
		this.nome = new Nome(primeiroNome, sobrenome);
		this.endereco = new Endereco(nomeDaRua, numeroDaRua);
	}
	
	void display() {
		System.out.println("Cadastro do Aluno: ");
		this.nome.display();
		this.endereco.display();
	}
}
