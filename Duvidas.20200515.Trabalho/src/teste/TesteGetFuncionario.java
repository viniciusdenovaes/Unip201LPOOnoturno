package teste;

import entidade.Funcionario;
import interacao.Interacao;

public class TesteGetFuncionario {
	
	public static void main(String[] args) {
		
		Interacao inte = new Interacao();
		Funcionario f = inte.getFuncionario();
		System.out.println(f);
		
	}

}
