package interacao;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Funcionario;

public class Interacao {
	
	public Acao getAcaoUsuario() {
		Acao resposta = null;
		
		while(resposta==null) {
			System.out.println("Digite a sua acao:");
			System.out.println("1 - Para listar");
			System.out.println("2 - Para incluir funcionario");
			System.out.println("3 - Para sair");
			Scanner in = new Scanner(System.in);
			String palavra = in.next();
			palavra = palavra.strip();
			if(palavra.equals("1")) {
				resposta = Acao.LISTAR;
			}
			else if(palavra.equals("2")) {
				resposta = Acao.INCLUIR;
			}
			else if(palavra.equals("3")) {
				resposta = Acao.SAIR;
			}
			else {
				System.out.println("Acao nao reconhecida\n");
			}
		}
		
		return resposta;
	}
	
	public void avisarTermino() {
		System.out.println();
		System.out.println("Programa Terminado");
		System.out.println("Até Mais");
	}
	
	
	public void listar(ArrayList<Funcionario> funcionarios) {
		System.out.println();
		System.out.println("Listando Funcionarios:");
		System.out.println();
		for(Funcionario f: funcionarios) {
			String fView = "";
			fView += "Nome: " + f.getNome() + "\n";
			fView += "Id: " + f.getId() + "\n";
			fView += "Salario: " + f.getSalario() + "\n";
			System.out.println(fView);
		}
	}
	
	public Funcionario getFuncionario() {
		System.out.println("Entre com os dados do funcionario:");
		
		System.out.println("Nome:");
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		System.out.println("id");
		String id = in.next();
		
		System.out.println("Salario:");
		double salario = getDoublePositivo();
		
		Funcionario f = new Funcionario(id, nome, salario);
		return f;
	}
	
	private double getDoublePositivo() {
		double res;
		Scanner in = new Scanner(System.in);
		String palavra = in.next();
		
		try {
			res = Double.parseDouble(palavra);
			if(res<0) throw new NumberFormatException();
		}catch(NumberFormatException e) {
			System.out.println("Entrada não é um número positivo");
			System.out.println("Por favor entre com um número positivo");
			return getDoublePositivo();
		}
		return res;
	}

}




