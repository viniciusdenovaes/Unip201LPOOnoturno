
public class TesteCadastroAluno {
	public static void main(String[] args) {
		
		CadastroAluno cadastro1;
		cadastro1 = new CadastroAluno(
				"Joao", "Gomez", 
				"Sem nome", 0);
		cadastro1.display();
		
		CadastroAluno cadastro2;
		cadastro2 = new CadastroAluno(
				"Maria", "Batista", 
				"Com nome", 1);
		cadastro2.display();
		
	}
}
