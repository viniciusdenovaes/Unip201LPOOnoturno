
public class CadastroAluno {
	
	Nome nome;
	Endereco endereco;
	
	CadastroAluno() {
		this.nome = new Nome();
		this.endereco = new Endereco();
	}
	
	void display() {
		System.out.println("Cadastro do Aluno: ");
		this.nome.display();
		this.endereco.display();
	}
}
