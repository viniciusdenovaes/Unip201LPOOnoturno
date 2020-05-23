package entidade.mapeamentos;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import entidade.Aluno;
import entidade.Materia;
import entidade.Nota;

public class CadastroFaculdade {
	
	Map<Aluno, Map<Materia, Nota>> historicosByAlunos;
	Set<Aluno> alunos;
	
	public CadastroFaculdade() {
		historicosByAlunos = new TreeMap<Aluno, Map<Materia, Nota>>();
		alunos = new TreeSet<>();
	}
	
	public void addAluno(Aluno aluno) {
		historicosByAlunos.put(aluno, new TreeMap<Materia, Nota>());
		alunos.add(aluno);
	}
	
	public void addHistorico(Aluno aluno, Materia materia, Nota nota) {
		Map<Materia, Nota> historico = historicosByAlunos.get(aluno);
		historico.put(materia, nota);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Faculdade: \n"; 
		for(Aluno aluno: alunos) {
			Map<Materia, Nota> historico = historicosByAlunos.get(aluno);
			res += "Materias do aluno " + aluno + ":\n";
			for(Materia materia: historico.keySet()) {
				Nota nota = historico.get(materia);
				res += "\t" + materia + "\n";
				res += "\t\t" + nota + "\n";
				res += "\t\tPassou? " + materia.passou(nota) + "\n";
			}
		}
		
		return res;
		
	}

}





