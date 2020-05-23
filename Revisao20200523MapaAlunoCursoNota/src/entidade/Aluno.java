package entidade;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String ra;
	
	public Aluno(String nome, String ra) {
		this.nome = nome;
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public String getRa() {
		return ra;
	}
	
	
	
	@Override
	public int compareTo(Aluno o) {
		return this.getRa().compareTo(o.getRa());
	}
	
	
	@Override
	public boolean equals(Object other) {
		if(this==other) return true;
		if(! (other instanceof Aluno)) return false;
		Aluno otherAluno = (Aluno) other;
		
		return this.getRa().equals(otherAluno.getRa());
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", ra=" + ra + "]";
	}

	

}
