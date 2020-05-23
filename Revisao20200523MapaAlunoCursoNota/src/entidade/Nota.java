package entidade;

public class Nota {
	
	private double nota1;
	private double nota2;
	private double notaSub;
	private double notaExame;
	
	public Nota(double nota1, double nota2, double notaSub, double notaExame) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaSub = notaSub;
		this.notaExame = notaExame;
	}

	public Nota() {
		this(0, 0, 0, 0);
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaSub() {
		return notaSub;
	}

	public void setNotaSub(double notaSub) {
		this.notaSub = notaSub;
	}

	public double getNotaExame() {
		return notaExame;
	}

	public void setNotaExame(double notaExame) {
		this.notaExame = notaExame;
	}

	@Override
	public String toString() {
		return "Nota [nota1=" + nota1 + ", nota2=" + nota2 + ", notaSub=" + notaSub + ", notaExame=" + notaExame + "]";
	}
	
	

}
