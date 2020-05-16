package entidade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

public class Empresa {
	
	private TreeMap<String, Funcionario> funcionariosByID;
	
	public Empresa() {
		funcionariosByID = new TreeMap<>();
	} 
	
	public void addFuncionario(Funcionario f) {
		funcionariosByID.put(f.getId(), f);
	}
	
	public void addFuncionario(Collection<Funcionario> funcionarios) {
		for(Funcionario f: funcionarios) {
			addFuncionario(f);
		}
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		for(Funcionario f: funcionariosByID.values()) {
			funcionarios.add(f);
		}
		
		return funcionarios;
	}
	
	
	
	

}
