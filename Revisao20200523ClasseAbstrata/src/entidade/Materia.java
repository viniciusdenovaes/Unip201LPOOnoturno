package entidade;

abstract public class Materia {

	private String nome;
	private double n1;
	private double n2;
	
	public Materia(String nome) {
		this.nome = nome;
		this.n1 = 0;
		this.n2 = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return n1;
	}
	
	public void setNota1(double nota) {
		n1 = nota;
	}

	public double getNota2() {
		return n2;
	}
	
	public void setNota2(double nota) {
		n2 = nota;
	}
	
	abstract public double media();
	
	abstract public double getNotaCorte();
	
	public boolean passou() {
		return media() >= getNotaCorte();
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res += "Nome: " + nome + "; ";
		res += "N1: " + n1 + ", ";
		res += "N2: " + n2 + ".";
		
		return res;
	}
}
