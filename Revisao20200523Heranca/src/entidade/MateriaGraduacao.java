package entidade;

public class MateriaGraduacao extends Materia{
	
	static public final double NOTA_CORTE = 7.0;
	
	public MateriaGraduacao(String nome) {
		super(nome);
	}

	public double media() {
		return (getNota1()+getNota2())/2.0;
	}
	
	public boolean passou() {
		return media() >= NOTA_CORTE;
	}
	

}










