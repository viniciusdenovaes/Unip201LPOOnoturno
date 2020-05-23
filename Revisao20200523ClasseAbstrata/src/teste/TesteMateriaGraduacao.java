package teste;

import entidade.MateriaGraduacao;

public class TesteMateriaGraduacao {
	
	public static void main(String[] args) {
		
		MateriaGraduacao mg1 = new MateriaGraduacao("LPOO");
		mg1.setNota1(9.5);
		mg1.setNota2(9.0);
		
		MateriaGraduacao mg2 = new MateriaGraduacao("LPOO");
		mg2.setNota1(5.5);
		mg2.setNota2(4.0);
		
		System.out.println(mg1);
		System.out.println("MG1 Passou? " + mg1.passou());
		System.out.println(mg2);
		System.out.println("MG2 Passou? " + mg2.passou());
		
		
	}

}
