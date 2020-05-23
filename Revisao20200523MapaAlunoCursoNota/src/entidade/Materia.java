package entidade;

abstract public class Materia implements Comparable<Materia>{

	private String nome;
	TipoCurso tipoCurso = null;
	
	public Materia(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	abstract public double media(Nota nota);
	
	abstract public double getNotaCorte();
	
	public boolean passou(Nota nota) {
		return media(nota) >= getNotaCorte();
	}
	
	@Override
	public int compareTo(Materia o) {
		if(!this.nome.equals(o.nome)) {
			return this.nome.compareTo(o.nome);
		}
		return this.tipoCurso.compareTo(o.tipoCurso);
	}
	
	
	@Override
	public boolean equals(Object other) {
		if(this==other) return true;
		if(! (other instanceof Materia)) return false;
		Materia otherMateria = (Materia) other;
		
		return 
				this.getNome().equals(otherMateria.getNome()) &&
				this.tipoCurso.equals(otherMateria.tipoCurso);
	}

	@Override
	public String toString() {
		String res = "";
		
		res += "Nome: " + nome + ", de " + tipoCurso;
		
		return res;
	}
}
