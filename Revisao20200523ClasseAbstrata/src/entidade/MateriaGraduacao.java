package entidade;

public class MateriaGraduacao extends Materia{
	
	static public final double NOTA_CORTE = 7.0;
	
	public MateriaGraduacao(String nome) {
		super(nome);
	}

	
	@Override
	public double media() {
		return (getNota1()+getNota2())/2.0;
	}

	@Override
	public double getNotaCorte() {
		return NOTA_CORTE;
	}
	
}










