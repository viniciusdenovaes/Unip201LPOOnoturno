package entidade;

public class MateriaPosGraduacao extends Materia{
	static public final double NOTA_CORTE = 5.0;
	
	public MateriaPosGraduacao(String nome) {
		super(nome);
		tipoCurso = TipoCurso.POS_GRADUACAO;
	}
	
	@Override
	public double media(Nota nota) {
		return (nota.getNota1()+nota.getNota2()+nota.getNotaSub())/3.0;
	}

	@Override
	public double getNotaCorte() {
		return NOTA_CORTE;
	}


}
