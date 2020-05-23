package entidade;

public class MateriaPosGraduacao extends Materia{
	static public final double NOTA_CORTE = 5.0;
	
	private double n3;
	
	public MateriaPosGraduacao(String nome) {
		super(nome);
		this.n3 = 0;
	}
	
	public double getNota3() {
		return n3;
	}
	
	public void setNota3(double nota) {
		n3 = nota;
	}
	
	public double media() {
		return (getNota1()+getNota2()+getNota3())/3.0;
	}
	
	public boolean passou() {
		return media() >= NOTA_CORTE;
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res += super.toString();
		res = res.strip();
		res = res.substring(0, res.length()-1);
		res += ", ";
		res += "N3: " + n3 + ".";
		
		return res;
	}


}
