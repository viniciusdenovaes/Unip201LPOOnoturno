package teste;

import entidade.MateriaGraduacao;
import entidade.MateriaPosGraduacao;

public class TesteMaterias {
	
	public static void main(String[] args) {
		
		MateriaGraduacao mg1 = new MateriaGraduacao("LPOO");
		mg1.setNota1(9.5);
		mg1.setNota2(9.0);
		
		MateriaGraduacao mg2 = new MateriaGraduacao("LPOO");
		mg2.setNota1(5.5);
		mg2.setNota2(4.0);
		
		MateriaPosGraduacao mpg1 = new MateriaPosGraduacao("LPOO");
		mpg1.setNota1(9.5);
		mpg1.setNota2(9.0);
		mpg1.setNota3(8.0);
		
		MateriaPosGraduacao mpg2 = new MateriaPosGraduacao("LPOO");
		mpg2.setNota1(5.5);
		mpg2.setNota2(4.0);
		mpg2.setNota3(3.0);
		
		System.out.println(mg1);
		System.out.println("MG1 Passou? " + mg1.passou());
		System.out.println(mg2);
		System.out.println("MG2 Passou? " + mg2.passou());
		System.out.println(mpg1);
		System.out.println("MPG1 Passou? " + mpg1.passou());
		System.out.println(mpg2);
		System.out.println("MPG2 Passou? " + mpg2.passou());
		
		
	}

}
