package teste;

import java.util.ArrayList;

import entidade.Empresa;
import entidade.Funcionario;
import input_output.InputUtil;
import input_output.OutputUtil;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = InputUtil.getFuncionarios(); 
		
		for(Funcionario e: funcionarios) {
			System.out.println("\nEmpregado: " + e);
		}
		
		Empresa empresa = new Empresa();
		empresa.addFuncionario(funcionarios);
		
		System.out.println("\n\nNa Empresa\n\n");
		for(Funcionario f: empresa.getFuncionarios()) {
			System.out.println(f);
		}
		
		OutputUtil.saveEmpregados(empresa.getFuncionarios());

		
	}

}
