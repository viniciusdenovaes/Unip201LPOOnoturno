package teste;

import java.util.ArrayList;

import entidade.Funcionario;
import input_output.InputUtil;

public class TesteInput {
	
	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = InputUtil.getFuncionarios(); 
		
		for(Funcionario e: funcionarios) {
			System.out.println("\nEmpregado: " + e);
		}
		
	}

}
