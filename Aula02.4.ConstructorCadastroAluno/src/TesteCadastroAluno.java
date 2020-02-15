
public class TesteCadastroAluno {
	public static void main(String[] args) {
		
		CadastroAluno cadastro1;
		cadastro1 = new CadastroAluno(
				new Nome("Joao", "Gomez"), 
				new Endereco("Sem nome", 0));
		cadastro1.display();
		
		CadastroAluno cadastro2;
		Nome nome = new Nome("Maria", "Batista");
		Endereco endereco = new Endereco("Com nome", 1);
		cadastro2 = new CadastroAluno(nome, endereco);
		cadastro2.display();
		
	}
}
