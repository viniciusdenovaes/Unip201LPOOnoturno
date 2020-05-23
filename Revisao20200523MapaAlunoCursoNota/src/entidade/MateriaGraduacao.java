package entidade;

public class MateriaGraduacao extends Materia{
	
	static public final double NOTA_CORTE = 7.0;
	
	public MateriaGraduacao(String nome) {
		super(nome);
		tipoCurso = TipoCurso.GRADUACAO;
	}

	
	@Override
	public double media(Nota nota) {
		return (nota.getNota1()+nota.getNota2())/2.0;
	}

	@Override
	public double getNotaCorte() {
		return NOTA_CORTE;
	}
	
}










