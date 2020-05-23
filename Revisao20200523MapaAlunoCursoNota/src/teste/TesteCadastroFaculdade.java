package teste;

import entidade.Aluno;
import entidade.Materia;
import entidade.MateriaGraduacao;
import entidade.MateriaPosGraduacao;
import entidade.Nota;
import entidade.mapeamentos.CadastroFaculdade;

public class TesteCadastroFaculdade {
	
	public static void main(String[] args) {
		
		CadastroFaculdade faculdade = new CadastroFaculdade();
		
		Aluno aluno01 = new Aluno("chaves da silva", "123");
		Aluno aluno02 = new Aluno("quico", "124");
		
		faculdade.addAluno(aluno01);
		faculdade.addAluno(aluno02);
		
		Materia lpooPos = new MateriaPosGraduacao("LPOO");
		Materia lpoo = new MateriaGraduacao("LPOO");
		Materia plPos = new MateriaPosGraduacao("PL");
		Materia pl = new MateriaGraduacao("PL");
		
		faculdade.addHistorico(aluno01, lpoo,    new Nota(9.0, 9.0, 0.0, 0.0));
		faculdade.addHistorico(aluno01, lpooPos, new Nota(9.0, 9.0, 7.0, 0.0));
		faculdade.addHistorico(aluno01, pl,      new Nota(7.0, 7.0, 0.0, 0.0));
		faculdade.addHistorico(aluno01, plPos,   new Nota(7.0, 7.5, 8.0, 0.0));
		
		faculdade.addHistorico(aluno02, lpoo,    new Nota(2.0, 1.0, 0.0, 0.0));
		faculdade.addHistorico(aluno02, lpooPos, new Nota(3.0, 5.0, 2.0, 0.0));
		faculdade.addHistorico(aluno02, pl,      new Nota(3.0, 2.0, 0.0, 0.0));
		faculdade.addHistorico(aluno02, plPos,   new Nota(1.0, 2.5, 3.0, 0.0));
		
		System.out.println(faculdade);
		
		
	}

}
