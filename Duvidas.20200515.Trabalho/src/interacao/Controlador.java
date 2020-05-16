package interacao;

import java.util.ArrayList;

import entidade.Empresa;
import entidade.Funcionario;
import input_output.InputUtil;
import input_output.OutputUtil;

public class Controlador {
	
	Empresa empresa = new Empresa();
	Interacao interacao = new Interacao();
	
	public void init() {
		preparacao();
		
		Acao acao = null;
		while(acao != Acao.SAIR) {
			acao = interacao.getAcaoUsuario();
			if(acao == Acao.LISTAR) {
				ArrayList<Funcionario> funcionarios = empresa.getFuncionarios();
				interacao.listar(funcionarios);
			}
			if(acao == Acao.INCLUIR) {
				Funcionario funcionario = interacao.getFuncionario();
				empresa.addFuncionario(funcionario);
			}
		}
		OutputUtil.saveEmpregados(empresa.getFuncionarios());
		interacao.avisarTermino();
		
		
	}
	
	public void preparacao() {
		ArrayList<Funcionario> funcionarios = InputUtil.getFuncionarios();
		empresa.addFuncionario(funcionarios);
	}

}
