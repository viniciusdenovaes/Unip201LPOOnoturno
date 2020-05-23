package teste;

import java.util.Set;
import java.util.TreeSet;

import entidade.Materia;
import entidade.MateriaGraduacao;
import entidade.MateriaPosGraduacao;

public class TesteMateria {
	
	public static void main(String[] args) {
		
		Materia lpooPos = new MateriaPosGraduacao("LPOO");
		Materia lpoo = new MateriaGraduacao("LPOO");
		Materia plPos = new MateriaPosGraduacao("PL");
		Materia pl = new MateriaGraduacao("PL");
		
		System.out.println(lpooPos);
		System.out.println(lpoo);
		System.out.println(plPos);
		System.out.println(pl);
		
		Set<Materia> materias = new TreeSet<>();
		materias.add(lpooPos);
		materias.add(lpoo);
		materias.add(plPos);
		materias.add(pl);
		
		System.out.println(materias);

		
	}

}
