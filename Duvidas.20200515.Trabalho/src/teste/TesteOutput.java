package teste;

import java.util.ArrayList;

import entidade.Funcionario;
import input_output.InputUtil;
import input_output.OutputUtil;

public class TesteOutput {
	
	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = InputUtil.getFuncionarios(); 
		
		for(Funcionario e: funcionarios) {
			System.out.println("\nEmpregado: " + e);
		}
		System.out.println("salvando empregados");
		OutputUtil.saveEmpregados(funcionarios);
		

		
	}

}
