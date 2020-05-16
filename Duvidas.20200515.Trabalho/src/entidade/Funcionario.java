package entidade;

public class Funcionario {
	
	private String id;
	private String nome;
	private double salario;
	
	public Funcionario(String aId, String aNome, double aSalario) {
		this.id = aId;
		this.nome = aNome;
		this.salario = aSalario;
	}
	
	public String getId() {return this.id;}
	public String getNome() {return this.nome;}
	public double getSalario() {return this.salario;}
	
	@Override
	public String toString() {
		String res = "";
		res += "Nome(" + id + "): " + nome + "; " + salario;
		return res;
	}

}
