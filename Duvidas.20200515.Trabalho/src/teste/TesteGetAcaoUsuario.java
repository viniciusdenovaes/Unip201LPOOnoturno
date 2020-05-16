package teste;

import interacao.Acao;
import interacao.Interacao;

public class TesteGetAcaoUsuario {
	
	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Acao acao = interacao.getAcaoUsuario();
		
		System.out.println("\n\nNO MAIN\n\n");
		System.out.println("Acao: " + acao);
		
	}

}
